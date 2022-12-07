package prac7Dec;

import java.io.Console;

public class ReadStringTest {

public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str; char ch[];
Console c= System.console();
System.out.println("enter your name");
String n=c.readLine();
System.out.println("enter your password");
char[] ch=c.readPassword();
String pass=String.valueOf(ch);//converting array into string
System.out.println("Welcome "+n);
System.out.println("password is: "+pass);
	}

}
