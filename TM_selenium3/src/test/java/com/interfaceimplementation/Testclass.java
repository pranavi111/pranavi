package com.interfaceimplementation;

interface printable1
{  
	void print();  
	}  
interface printable2
{  
	void show();  
	}  

/*interface printable1
{  
	void print();  
	
	void show();  
	}*/





class Testclass implements printable1
{  
	public void print()
	{
		int a=11;
		System.out.println(a);
		 
	}
	public void show()
	{
		
		System.out.println("hello");
		 
	}
	
	
	
	public static void main(String args[]){  
		Testclass obj = new Testclass();  
		obj.print(); 
		obj.show();
		 }  
		}  



