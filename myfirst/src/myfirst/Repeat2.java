package myfirst;

public class Repeat2 {

	public static void main(String[] args) {
		String data="i am learning java with selenium";
		data=data.replace(" ", "");

		char[] arr=data.toCharArray();
		String temp="";


		for(int i=0;i<=arr.length-1;i++)
		{
			char act=arr[i];

			if(!temp.contains(String.valueOf(act)))
			{

			for(int j=0;j<=arr.length-1;j++)
			{
				char exp=arr[j];

				if(String.valueOf(act).equals(String.valueOf(exp)))
				{
					temp=temp+act;
				}


			}

			}

		}

		System.out.println(temp);



	}

}
