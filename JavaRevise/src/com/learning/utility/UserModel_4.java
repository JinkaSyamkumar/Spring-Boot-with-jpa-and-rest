package com.learning.utility;

public class UserModel_4 {
		
		
		
	
		private String name="syam";	
		
		//we are assigning value from enum so datatype should be enum class type
		//private String company="TCS Ltd";
		
		//enum becomes type of its own
		private EnumClass company;
		private int age=25;
		private char gender='M';
		private int savings=600;
		
		//public UserModel_4() {}
		
		public UserModel_4(String name,int age,char gender,int savings,EnumClass company) {
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.savings=savings;
			this.company=company;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public int getSavings() {
			return savings;
		}
		public void setSavings(int savings) {
			this.savings = savings;
		}

		public EnumClass getCompany() {
			return company;
		}

		public void setCompany(EnumClass company) {
			this.company = company;
		}
}
