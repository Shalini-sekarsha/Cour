package com.example.courier.model;



	import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

	@Entity
	@Table(name="User_tbl")
	public class User {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
		
		@Column(name="name")
		private String name;
		@Column(name="address")
	private String address;
		@Column(name="scity")
	private String scity;
		@Column(name="ptype")
	private String ptype;
		@ManyToOne(targetEntity = Admin.class,cascade = CascadeType.ALL)
		@JoinColumn(name="admin")
		private Admin admin;
		
		
		public User() {
			super();
			
		}
		public User(int id, String name, String address, String scity,String ptype, Admin admin) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.scity = scity;
			this.ptype = ptype;
			this.admin = admin;
		}
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getScity() {
			return scity;
		}
		public void setScity(String scity) {
			this.scity = scity;
		}
		public String getPtype() {
			return ptype;
		}
		public void setPtype(String ptype) {
			this.ptype = ptype;
		}
		public Admin getAdmin() {
			return admin;
		}
		public void setAdmin(Admin admin) {
			this.admin = admin;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", address=" + address + ", scity=" + scity + ", ptype="
					+ ptype + ", admin=" + admin + "]";
		}
	
		
	}
	