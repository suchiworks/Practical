package prac11Nov;

import java.util.regex.Pattern;

public class QuantifiersRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Quatifiers
		//x? - x occur once or not at all x+ -- x occur once or more than one
		//x* -- x occur zero or more time  x{n} -- x occur n time x {7} only 7 char
		//x{n,} -- x occur n or more time x {7,} only 7 char or more		
		
boolean b7=Pattern.matches("[a-zA-Z0-9]{12,}", "Anud123ppp");
System.out.println(b7);
	}
}
