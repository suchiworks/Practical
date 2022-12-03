package prac3Dec;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Console c=System.console();
System.out.println("please enter your name");
String s= c.readLine();
System.out.println("welcome"+s);
System.out.println("please enter your password");
char []ch=c.readPassword();
String s1=String.valueOf(ch);//converting char array to string
System.out.println("your password is: "+s1);}
	

	catch(Exception e) {
		System.out.println(e);
	}

}
