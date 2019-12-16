package myfirst;

public class stringindia {

	public static void main(String[] args) {
		
		String data= "India is great country INDIA is having large population iNDIa is having good landscapes";
		
	
		System.out.println("The Total lengthof the given string is "+data.length());
		

		System.out.println(data.toLowerCase());
         String temp="india";
         int strlen=data.length();
         for(int i=0;i<=strlen-1;i++)
 		{

 			char charac=data.charAt(i);
 		}
           if(temp==data)
           {
   			System.out.println("print"+temp);
           }
   			else
          
   			{
   			System.out.println("dont print"+temp);
   		}
	}
}

