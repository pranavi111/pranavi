package xpath;

public class Inheritance {
              
	

		 Inheritance()
			{
			    
		System.out.println("parent");
				
              }
		
					
}
 class abc  extends Inheritance {
	 
	 
	 
	 abc()
	 {
	 
	 System.out.println("Child");
	 }

	public static void main(String[] args) {
		
		  
	
			System.out.println("main Child");
		   
			//new Inheritance();
			new abc();
			
			
			//new add(5,6);
		   }


	}
		

	


