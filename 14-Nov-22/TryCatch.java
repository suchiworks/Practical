package prac14Nov;
//Exception handling using try - catch
public class TryCatch {

	public static void main(String[] args) {
try {//may exception occur
	int num=25/0;//logic
	System.out.println("Result");//if Exception not occur this line will execute
}
catch(ArithmeticException r) {
	System.out.println("number cant divided by zero");
}
catch(Exception r) {
	System.out.println(r);
	System.out.println(25/5);
}
System.out.println("The End");//line will execute because outside try catch block
}}
 