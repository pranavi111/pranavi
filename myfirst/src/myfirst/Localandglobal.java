package myfirst;

public class Localandglobal {
	int a=10;
	int b=34;
	int c;

//need to explain
	public static void main(String[] args) {

		Localandglobal gb=new Localandglobal();

		gb.doTest();		
		System.out.println(gb.c);

	}



	public void doTest()
	{
		//local variables
		int a=40;
		int b=45;

		int c=a+b;

		System.out.println("Inside method "+c);

	}




		


		





	
}
