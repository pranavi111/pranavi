package myfirst;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		 System.out.println("enter the i");

		
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
		if(num%2 == 0)
		       System.out.println("even");

			
		else
			
			System.out.println("odd");
		

	}

}
