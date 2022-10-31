package prac20oct;
/*Write a Java method to check whether every digit of a given integer 
is even. Return true if every digit is odd otherwise false? */
import java.util.Scanner;

public class Main1 {
	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input an integer: ");
	        int a = in.nextInt();
	        System.out.print(test(a));
	        }
 public static boolean test(int n){
	    final int b=10;
	    if (n==0){
	        return false;}
	    
	    while(n!= 0){
	        if((n%b)%2!=0){
	            return false;}
	         n/=10;
	    }	     return true;
 }}
