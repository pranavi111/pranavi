package xpath;

public class Arguments1 {
	
	Arguments1()
	{ 
		System.out.println("hello");
	      
	}
	Arguments1(int a,int b)
	{
		int xx=a;
		int yy=b;
		System.out.println(a);
		System.out.println(b);
	}
	public void display()
	{
		System.out.println("Print Values :");
	}
	
	
	
	

	public static void main(String[] args) {
		
		Arguments1 obj = new Arguments1();
		obj.display();
		Arguments1 obj2 = new Arguments1(23,65);
		
	}

}
