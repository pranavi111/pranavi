package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class Duplicatesandcount {

	public static void main(String[] args) {
      String Str = "ggkhhhjubvfffg";
      Map<Character,Integer> ab = new HashMap<Character,Integer>();
      char[] arr=Str.toCharArray();
      for(char c : arr)
      {
    	  if(!char.containsKey(c))
    	  {
    		  chars.put(c, 1);
    	  }
			else
			{
				chars.put(c, chars.get(c)+1);
	}

	}
}
}
