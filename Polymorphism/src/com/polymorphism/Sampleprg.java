package com.polymorphism;

class abc {
	
    void Sound1()
	{
		
		System.out.println("kuku");
	}
	
	public class xyz extends abc
	{
		void Sound1()
		 {
		  System.out.println("kaka");
			
			 }
     }
	
	
	public static void main(String[] args)
	{
		abc  obj = new abc();
		obj.Sound1();
		
		

	}

}
