package myfirst;

public class Getposition {

	public static void main(String[] args) {
		String str="Thermal  plant is hot, The climate has been changed";

		int len=str.length()-1;

		String temp="";

		int counter=0;
		for(int i=0;i<=len;i++)
		{
			counter++;
			char c=str.charAt(i);

			if (Character.isSpace(c))
			{
				//System.out.println(true);

				if(temp.equals("The"))
				{
					break;
				}else
				{
					temp="";
				}



			}else
			{
				temp=temp+c;
			}//need explanation


		}

		System.out.println("Counter :"+(counter-4));


	}

}
