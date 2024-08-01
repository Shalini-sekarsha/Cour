package com.example.courier.repoimpl;




	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

import com.example.courier.model.Admin;
import com.example.courier.repository.AdminRepo;

import jakarta.persistence.EntityManager;
	import jakarta.persistence.Query;
	import jakarta.transaction.Transactional;
	@Repository
	@Transactional
	public class AdminRepoImpl implements AdminRepo{
		@Autowired
		EntityManager em;
		public List<Integer> getIDList() {
			
			return null;
		}

		@Override
		public String save(Admin admin) {
			if(admin!=null) {
			em.persist(admin);
			return "success";
			}
			else {
				return "failure";
			}
		}

		@Override
		public Admin findById(int aid) {
			
			return em.find(Admin.class, aid);
		
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Admin> findAll() {
			String hql="from Admin";
			Query query=em.createQuery(hql);
			
			return query.getResultList();
		}

		@Override
		public void update(Admin admin) {
			em.merge(admin);
			
		}

		@Override
		public String deleteById(int aid) {
			if(aid!=0) {	
			Admin a=em.find(Admin.class,aid);
			em.remove(a);
			return "deleted";
			}
			else {
			return "failure";}
		}
	}
		
		

	

