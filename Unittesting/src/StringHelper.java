
public class StringHelper {

	public String truncateInFirst2Positions(String str)
		{
		if(str.length()<=2)	
		return str.replaceAll("A", "");
		String first2Chars=str.substring(0, 4);
String stringMinusFirst2Chars=str.substring(2);
return first2Chars.replaceAll("A","") + stringMinusFirst2Chars;
	}

}
