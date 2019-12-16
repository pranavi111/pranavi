
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rerex {


	public String getPatternData(String pattern,String data)
	{
		String result ="";
		Pattern p=Pattern.compile(pattern);

		Matcher match=p.matcher(data);


		boolean status =false;


		while(match.find())
		{
			status=true;			
			result=match.group();
			break;
		}

		if(status)
		{
			System.out.println("Data Exist :"+result);
		}
		else
		{
			System.out.println("Data not exist");
		}
		return result;





	}





}
