package com.encapsulation;

public class TestData {
	//public class TestDataVo {


		private String gender;

		private String firstName;

		private String lastName;

		private String day;

		private String month;

		private String year;

		private String email;

		private String password;

		private String confirmPassword;
		
		

		 TestData(String gender, String firstName, String lastName, String day, String month, String year,
				String email, String password, String confirmPassword) {
			super();
			this.gender = gender;
			this.firstName = firstName;
			this.lastName = lastName;
			this.day = day;
			this.month = month;
			this.year = year;
			this.email = email;
			this.password = password;
			this.confirmPassword = confirmPassword;
		}

		public void getGender() {
			//return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getConfirmPassword() {
			return confirmPassword;
		}

		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}

		

		}
