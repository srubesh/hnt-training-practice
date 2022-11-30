package com.example.practice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String username;
		private String password;
		private String emailId;
		private int phoneNmuber;
		private String role;
		private Character isActive;
		
		
		
		
		public Users() {
		}

		public Users(String username, String password, String emailId, int phoneNmuber, String role, Character isActive) {
			this.username = username;
			this.password = password;
			this.emailId = emailId;
			this.phoneNmuber = phoneNmuber;
			this.role = role;
			this.isActive = isActive;
		}

		public Users(int id, String username, String password, String emailId, int phoneNmuber, String role,
				Character isActive) {
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
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}


		public Character isActive() {
			return isActive;
		}

		public void setActive(Character isActive) {
			this.isActive = isActive;
		}


		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", emailId=" + emailId
					+ ", phoneNmuber=" + phoneNmuber + ", Role=" + role + ", isActive=" + isActive + "]";
		}
}
