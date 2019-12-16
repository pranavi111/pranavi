package xpath;

public class ex1 {
    
	

	 ex1()
		{
		    
	System.out.println("parent");
			
         }
	  void disp()
	 {
		   
		System.out.println("Parent Method");
			
		  }
	
				
}
public class child  extends ex1 {


child()
{

System.out.println("Child");
}

public static void main(String[] args) {
	
	  

		System.out.println("main Child");
	   
		//new Inheritance();
		child priya = new child();
		priya.disp();
		
		//new add(5,6);
	   }


}
	

