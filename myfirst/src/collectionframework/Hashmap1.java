package collectionframework;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<String,Integer> abc=new HashMap<>();
		abc.put("",1);
		abc.put("ghk",2);
		abc.put("hhjv",3);
		String temp="";
		
		/*
		 * System.out.println(abc); //output:{hgf=1, ghk=2, hhjv=3}
		 * 
		 * System.out.println("print the size"+abc.size());//print the size3
		 * 
		 * System.out.println(abc.containsKey("hgf"));//true
		 * 
		 * System.out.println(abc.get("hgf"));//1
		 */
		
		//abc.clear();
		//System.out.println(abc);//{}
		
		/*
		 * abc.remove("ghk"); System.out.println(abc); //{hgf=1, hhjv=3}
		 */
		
		if(abc.isEmpty());//not getting output
		{
			temp=temp+abc;
		System.out.println(abc);
		}
	
	}	
	
		
		
		

	}

}
