package patterns;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		
		
		int i,j,lines = 0;
		int space=0;
		Scanner sc = new Scanner(System.in);
		   System.out.println("enter number of lines");
		   lines = sc.nextInt();
    
		int spaces=(lines*2)-2;
		
		
		
		for(i=1;i<=lines;i++)//number of lines
		{
		   for(lines=1;lines<=i;lines++)
		   {
                System.out.println();
	       }
		   for(int s=1;s<=spaces;s++)
		   {
			   System.out.print(" ");
		   }
		   for(int Rlines=1;Rlines<=i;Rlines++)
		   {
                System.out.println("*");
	       }
		   spaces=spaces-2;
		   System.out.println();
	}
	}
}
