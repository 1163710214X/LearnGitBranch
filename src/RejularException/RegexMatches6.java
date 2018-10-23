package RejularException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches6 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(\\bVertexType\\b)\\s*=\\s*¡°.+?¡±");
		Matcher matcher = pattern.matcher("VertexType = ¡°Computer¡±, ¡°Router¡±, ¡°Server¡±" );
	    while(matcher.find())
	    {
	    	int i =1;
	    	System.out.println("µÚ"+i+"×é£º"+matcher.group(i));
	    	i++;
	    }

	}
}
