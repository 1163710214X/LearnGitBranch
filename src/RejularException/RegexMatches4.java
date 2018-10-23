package RejularException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches4 {
     private static String REGEX = "dog";
     private static String INPUT = "The dog says mo;All dogs say mo";
     private static String REPLECE = "cat";
     public static void main(String[] args)
     {
    	 Pattern p = Pattern.compile(REGEX);
    	 Matcher m = p.matcher(INPUT);
    	 INPUT = m.replaceAll(REPLECE);
    	 System.out.println(INPUT);
     }
	
}
