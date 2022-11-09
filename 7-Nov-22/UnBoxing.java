package prac7Nov;
//Wrapping to primitive
public class UnBoxing {

	public static void main(String[] args) {
Integer a= new Integer(2);
Integer i= a.intValue();//converting Integer into int
Integer j=a;    //now compiler will write int.value() unboxing
System.out.println(a+" "+i+" "+j);

	}

}
