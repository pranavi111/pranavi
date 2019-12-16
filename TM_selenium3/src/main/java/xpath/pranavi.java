package xpath;

public class pranavi {

	pranavi()
		{
		    
	System.out.println("parent");
			
      }
	  void disp()
	 {
		   
		System.out.println("Parent Method");
			
		  }
	
				
}
 class child  extends pranavi {


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


