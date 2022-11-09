package prac7Nov;
//Wrapper

public class Autoboxing {

	public static void main(String[] args) {

		int a=10;//primitive type
		Integer i=Integer.valueOf(a);//converting int into integer
		Integer j=a;     //Autoboxing
		System.out.println(a+" "+i+" "+j);
	}

}
