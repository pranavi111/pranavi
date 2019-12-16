package myfirst;

public class Prime { 
	
    public static void main(String[] args) {
        int num = 29,temp=0;
      
        for(int i = 2; i <= num; ++i)
        {
           
            if(num % i == 0)
            {
            	temp=temp+1;
            }
        }      
         
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
