package prac15Nov;

public class NestedTry {

	public static void main(String[] args) {
try { //outer try block
	try {// inner try block1
	System.out.println("going to divide by 0");
		int b =19/0;
	}
	catch(ArithmeticException e){//catch block inner try block 1
System.out.println(e);}
	try { //inner try block 2
		int a[]=new int[5];
		a[6]=4;    //Assigning the value out of array bounds
	}
	catch(ArrayIndexOutOfBoundsException e){//catch block of outer try block
		System.out.println(e);}
	System.out.println("other statement");}

	catch(Exception e) {//catch block of outer try block
		System.out.println("handle the exception (outer catch)");}
	System.out.println("normal flow..");
	}
	
}