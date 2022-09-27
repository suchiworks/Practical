package sep26Assg;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prime number
int n,count=0,i;
System.out.println("enter any number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2; i<=n;i++) {
	if(n%i==0) {
		count++;
		break;
	}
}
if(count==0)
	System.out.println("\n prime number");
	}
	System.out.println("\n not a prime number");
}
}
