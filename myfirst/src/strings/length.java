package strings;

public class length {

	public static void main(String[] args) {
		String[] emp_usernames=new String[5];

		//Assigning an item to an array

		emp_usernames[0]="Prathap";
		emp_usernames[1]="Raj";
		emp_usernames[2]="Krish";
		emp_usernames[3]="Ram";
		emp_usernames[4]="Rahul";

		emp_usernames[1]="Ramya";
		emp_usernames[2]="Rahul";
		//emp_usernames[1]=1236;
		
//		System.out.println(emp_usernames[0]);
//		System.out.println(emp_usernames[1]);

		for (String item : emp_usernames) {
			//System.out.println(item);
		}

		System.out.println("********************************");

	int arrlen=emp_usernames.length-1;

		for(int i=0;i<=arrlen;i++)
		{
			System.out.println(emp_usernames[i]);
		}
		System.out.println(emp_usernames[2]);
}


	}


