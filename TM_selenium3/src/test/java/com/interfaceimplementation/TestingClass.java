package com.interfaceimplementation;

public class TestingClass implements Interface2 {
	
	public static void main(String[] args) {
		
		TestingClass obj = new TestingClass();
		
		obj.login();
		obj.resetPassword();
		//obj.sinUp();
		//obj.forgetPassword();
		
		}

	public void login() {
		System.out.println("Reset Password");

		}

	public void resetPassword() {
		
		System.out.println("Reset Password1");

		
	}

	public void sinUp() {
	
		System.out.println("Reset Password2");
	}

	public void forgetPassword() {
		System.out.println("Reset Password3");
		
	}

	

}
