package myfirst;

public class Getnumetric {

	public static void main(String[] args) {
		String str="The Transaction id :107774545489 The Voucher number :852 The Transaction id:851";
		String temp="";
				for(int i=0;i<=str.length()-1;i++)
				{
					char c=str.charAt(i);
					if(i!=str.length()-1)
					{				
					char space=str.charAt(i+1);

					if(Character.isDigit(c) &&  Character.isSpaceChar(space))
					{
						temp=temp+c+"@";
					}else
					{
						temp=temp+c;
					}

					}
					else
					{
						temp=temp+c;
					}
				}


				String[] arr=temp.split("@");

				for (String sentence : arr) {

					System.out.println(sentence.trim());
					System.out.println(getNumeric(sentence.trim()));

				}





			}


			public static String getNumeric(String data)
			{
				String temp="";

				for(int i=0;i<=data.length()-1;i++)
				{
					char c=data.charAt(i);


					if(Character.isDigit(c))temp=temp+c;


				}
				return temp;

	}

}
