package com.example.practice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String username;
		private String password;
		private String emailId;
		private int phoneNmuber;
		private String Role;
		private boolean isActive;
		
		
		
		
		public User() {
		}

		public User(String username, String password, String emailId, int phoneNmuber, String role, boolean isActive) {
			this.username = username;
			this.password = password;
			this.emailId = emailId;
			this.phoneNmuber = phoneNmuber;
			Role = role;
			this.isActive = isActive;
		}

		public User(int id, String username, String password, String emailId, int phoneNmuber, String role,
				boolean isActive) {
			this(username, password, emailId, phoneNmuber, role, isActive);
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


		public int getPhoneNmuber() {
			return phoneNmuber;
		}

		public void setPhoneNmuber(int phoneNmuber) {
			this.phoneNmuber = phoneNmuber;
		}


		public String getRole() {
			return Role;
		}

		public void setRole(String role) {
			Role = role;
		}


		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}


		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", emailId=" + emailId
					+ ", phoneNmuber=" + phoneNmuber + ", Role=" + Role + ", isActive=" + isActive + "]";
		}
}
