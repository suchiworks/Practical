package prac7Nov;
//Wrapper 

import java.util.ArrayList;

public class UnBoxingEg {
	public static void main(String[] args) {

		ArrayList<Integer>a1=new ArrayList<Integer>();
		//Autoboxing
		a1.add(5);//adding the int primitive type value by using add()method
		a1.add(2);
		System.out.println("ArrayList:"+a1);
		//UnBoxing
		int a=a1.get(0);
		int b=a1.get(1);// 5 Integer convert to int
		System.out.println("Value of Index 0:"+a+" "+b);
	}}


