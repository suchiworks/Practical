package sep26Assg;
import java.io.*;
public class Pattern {
   public static void printTriangle(int n) {
					// TODO Auto-generated method stub
			       for(int i=0;i<=n;i++) {
				   for(int j=n-1;j>1;j--) {
					    System.out.print(" ");
					//inner loop
				   for(j=0; j<i; j++) {
						System.out.print(" * ");
					}
					    System.out.println();
				    }	
				}
			}
			    public static void main(String[] args) {
				   int n = 5;
				   printTriangle(n);}
			
	    }	
	