package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_names {

	public static void main(String[] args) {
		List<String> Frds =new ArrayList<>();
		Frds.add( "ravali");
		Frds.add( "ravi");
		Frds.add( "banu");
		Frds.add( "pranay");
		List<String> best =new ArrayList<>();
		Frds.add( "ra");
		Frds.add( "rav");
		Frds.add( "ba");
		Frds.add( "pra");
		Frds.addAll(best);
		System.out.println(Frds.remove(2));//banu
                                           //7
		//getting ra as output(dout)
		System.out.println(Frds.get(3));
		System.out.println(Frds.contains("ba"));  //true
		
		
		
		
		System.out.println(Frds);
		System.out.println(Frds.size());//output:4
		System.out.println(Frds);//output:[ravali, ravi, banu, pranay]
		System.out.println(Frds.get(1));//output:ravi
		System.out.println(Frds.get(Frds.size()-4));//output:ravali
		System.out.println(Frds.get(Frds.size()-6));//output:IndexOutOfBoundsException:
		List<String> Bests = new ArrayList<>();
		Bests .add("abc");
		Bests .add("hgf");
		System.out.println(Bests);//output:[abc, hgf]*/
		
		
		 //iterate over a list
			Iterator itr=Frds.listIterator(); //output:ravali
                                                     // ravi
                                                      // banu
                                                      //pranay

			//to check if there is next item exist
			while(itr.hasNext())
			{
				//print the current items and move the cursor to the next item
				System.out.println(itr.next());
			}

		 for(Object object:Frds)
		   {
		  System.out.println(object);  //output:ravali
		                              // ravi
		                              // banu
		                               //pranay

		  } 
		  
	}

}
