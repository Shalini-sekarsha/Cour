package com.example.courier.repoimpl;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import com.example.courier.model.User;
	import com.example.courier.repository.UserRepo;import jakarta.persistence.EntityManager;
	import jakarta.persistence.Query;
	import jakarta.transaction.Transactional;
	@Repository
	@Transactional
	public class UserRepoImpl implements UserRepo{
	@Autowired
	EntityManager em;
		@Override
		public String save(User user) {
			if(user!=null) {
			em.merge(user);
			return "success";
			}
			else {
				return "failure";}
			
		}

		@Override
		public User findById(int id) {
			
			return em.find(User.class, id);
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<User> findAll() {
			String hql="from User";
			Query query=em.createQuery(hql);
			
			return query.getResultList();
		}

		@Override
		public void update(User user) {
			em.merge(user);
			
		}

		@Override
		public String deleteById(int id) {
			if(id!=0) {
			User use=em.find(User.class,id);
			em.remove(use);
			return "deleted";}
			else {
			return "deletion failure";}
			}
			
		}

	

