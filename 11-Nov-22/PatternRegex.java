package prac11Nov;

import java.util.regex.Pattern;

public class PatternRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean b5=Pattern.matches("[a-zA-z]","A");
boolean b3=Pattern.matches("[pqr]","pqr");
boolean b6=Pattern.matches("[^abc]","r");
System.out.println(b5+" "+b3+" "+b5);
	}

}
