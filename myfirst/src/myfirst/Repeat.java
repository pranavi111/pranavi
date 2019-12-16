package myfirst;

public class Repeat {

	public static void main(String[] args) {
		  
		
		String data="i am learning java with selenium";
		data=data.replace(" ", "");
		System.out.println(data);
		int counter=0;

		char[] arr=data.toCharArray();
		String temp="";
		System.out.println(temp );

		for(int i=0;i<=arr.length-1;i++)
		{
			char act=arr[i];

			if(!temp.contains(String.valueOf(act)))
			{
              System.out.print(act);
			for(int j=0;j<=arr.length-1;j++)
			{
				char exp=arr[j];

				if(String.valueOf(act).equals(String.valueOf(exp)))
				{
					temp=temp+act;
					
					counter++;
				}

				
			}

			}

		}

		//System.out.println(temp);
		System.out.println(counter);





	}
}

