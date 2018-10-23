package RejularException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches5 {

	public static void main(String[] args) {
		Pattern pattern6 = Pattern.compile("<.+?>");
		Matcher matcher6 = pattern6.matcher("<a href=\"index.html\">ึ๗าณ</a>");
		String string = matcher6.replaceAll("");
		System.out.println("\r" + string);  

	}

}
