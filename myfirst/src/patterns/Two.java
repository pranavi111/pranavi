package patterns;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		 int rows=sc.nextInt();
		 for(int i=1;i<=rows;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
	         }
		 System.out.println();

         }
}
}
/*enter the value
10
*
**
***
****
*****
******
*******
********
*********
********** */
