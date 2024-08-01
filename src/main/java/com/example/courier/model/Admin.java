package com.example.courier.model;





	
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	
	
	import jakarta.persistence.Table;

	@Entity
	@Table(name="Admin_tbl")
	public class Admin {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="aid")
	private int aid;
		@Column(name="servicename")
	private String servicename;
		@Column(name="serviceaddress")
	private String serviceaddress;
		@Column(name="contact")
	private int contact;
		
		
		public Admin() {
			super();
		}
		public Admin(int aid, String servicename, String serviceaddress, int contact) {
			super();
			this.aid = aid;
			this.servicename = servicename;
			this.serviceaddress = serviceaddress;
			this.contact = contact;
		}
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getServicename() {
			return servicename;
		}
		public void setServicename(String servicename) {
			this.servicename = servicename;
		}
		public String getServiceaddress() {
			return serviceaddress;
		}
		public void setServiceaddress(String serviceaddress) {
			this.serviceaddress = serviceaddress;
		}
		public int getContact() {
			return contact;
		}
		public void setContact(int contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "Admin [aid=" + aid + ", servicename=" + servicename + ", serviceaddress=" + serviceaddress
					+ ", contact=" + contact + "]";
		}
			
		}
	