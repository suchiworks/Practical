package prac12DecStack;

import java.util.Stack;

public class StackEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> s=new Stack<Integer>();
//checking eEmpty or not
boolean result=s.isEmpty();
System.out.println("is the stack empty?"+result);
//adding elements(push)
s.push(25);
s.push(35);
s.push(40);
s.push(55);
s.push(80);
s.push(75);
System.out.println("stack element:"+s);//result
//Integer digit=s.peek();
//System.out.println("\n stack element after peek:"+s);
Integer digit2=s.pop();
System.err.println("top elements:"+digit2);
System.out.println("\n stack element after pop:"+s);
int digit1=s.search(35);
System.out.println("search elements:"+digit1);
int x=s.size();
System.err.println("size:"+x);
result= s.empty();
System.out.println("Is the stack empty?:"+result);

	}

}
