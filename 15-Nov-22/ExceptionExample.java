package prac15Nov;
//Different types of exception
class ExceptionExample {
public void show() {
	String a="i am error";
	System.out.println(a);
	try {
		int i=50/0;//Atrithmetic Exception
		System.out.println(i);
		String s= "rita";
		System.out.println(s.length());
		int arr[]=new int [3];
		arr[4]=24;//array index out of bound exception
		int m= Integer.parseInt(s);//number format Exception
		System.out.println(m);

	}
	catch(Exception e) {
		System.out.println(e);}
	String b="i can not be handle";
	System.out.println(a+" "+b);//i am error + i can not be handle
}
public static void main(String[] args) {
	ExceptionExample ep=new ExceptionExample();
	ep.show();
}}
