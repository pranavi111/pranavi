package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Prati {

	public static void main(String[] args) {
	String data="aacggdthhhjjmmgg";
	Map<Character,Integer> chars=new HashMap<Character,Integer>();
		char[] arr=data.toCharArray();

	for (char c : arr) {
		chars.add(c);	
		System.out.println(c);
			}
		
		

	}

}
