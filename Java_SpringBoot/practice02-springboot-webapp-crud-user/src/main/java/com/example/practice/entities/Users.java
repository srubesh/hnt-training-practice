package com.example.practice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_USER")
public class Users {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)	
		private int id;
		private String username;
		private String password;
		private String emailId;
		private long phoneNmuber;
		private String role;
		private boolean activeStatus;
		
		
		
		
		public Users() {
		}

		public Users(String username, String password, String emailId, long phoneNmuber, String role, boolean activeStatus) {
			this.username = username;
			this.password = password;
			this.emailId = emailId;
			this.phoneNmuber = phoneNmuber;
			this.role = role;
			this.activeStatus = activeStatus;
		}

		public Users(int id, String username, String password, String emailId, long phoneNmuber, String role,
				boolean activeStatus) {
			this(username, password, emailId, phoneNmuber, role, activeStatus);
			this.id = id;
		}
		
		
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}


		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}


		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}


		public long getPhoneNmuber() {
			return phoneNmuber;
		}

		public void setPhoneNmuber(long phoneNmuber) {
			this.phoneNmuber = phoneNmuber;
		}


		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}


		public boolean isActiveStatus() {
			return activeStatus;
		}

		public void setActiveStatus(boolean activeStatus) {
			this.activeStatus = activeStatus;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", emailId=" + emailId
					+ ", phoneNmuber=" + phoneNmuber + ", Role=" + role + ", isActive=" + activeStatus + "]";
		}
}
