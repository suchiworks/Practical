package prac9NovString;
import java.util.StringTokenizer;
//simple way to break a string , package: java.util.StringTokenizer
public class StringTokenizerEg {
	public static void show() {
 StringTokenizer St1=new StringTokenizer("Anudip Foundation skill and Development");
 while(St1.hasMoreTokens()){ // boolean method it checks their is more token available or not
    System.out.println(St1.nextToken(" "));// string method it returns the next tokens from string tokenizer objects
   StringTokenizer St2=new StringTokenizer("Anudip Foundation, skill ");
   while(St2.hasMoreTokens()){
	   System.out.println();
System.out.println(St1.nextToken(" ,"));}}
				}
public static void main(String[] args) {
	show();
}
	}


