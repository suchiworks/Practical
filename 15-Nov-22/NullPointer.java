package prac15Nov;
//invoked method on the null object
public class NullPointer {
//int a=10;
	//public static NullPointer ram(){ //method invoked by using null object
	//return null;
	String str=null; //string value null
	int arr[]=null;//array object null
	String convert(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
NullPointer obj=new NullPointer();
//NullPointer obj=NullPointer.ram();
System.out.println(obj.convert(null));//through method passing argumants as null
System.out.println(obj.arr.length);
System.out.println(obj.str.equals("pallabi"));
//System.out.println(obj.a);
	}

}
