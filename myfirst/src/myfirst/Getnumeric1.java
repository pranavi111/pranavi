package myfirst;

public class Getnumeric1 {

	public static void main(String[] args) {
        public  String getNumeric(String data)
		{
			String temp="";

			for(int i=0;i<=data.length()-1;i++)
			{
				char c=data.charAt(i);


				if(Character.isDigit(c))
					temp=temp+c;


			}
			

}


	}

}
