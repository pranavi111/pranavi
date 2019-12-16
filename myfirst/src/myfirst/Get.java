package myfirst;

public class Get {

	public static void main(String[] args) {
	
		String data="ABCdfg";//abcDFG

		String temp="";

		for(int i=0;i<=data.length()-1;i++)
		{
			char c=data.charAt(i);
			if((int)c>=65 &&(int)c<=90)
			{
				int crntval=(int)c+32;
				temp=temp+(char)crntval;

			}
			else
			{
				int crntval=(int)c-32;
				temp=temp+(char)crntval;
			}



		}

		System.out.println(temp);



	}

}
