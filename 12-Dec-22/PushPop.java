package prac12DecStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class PushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
System.out.println("stack:"+s);
//pushing elements
pushelement(s,15);
pushelement(s,45);
pushelement(s,20);
pushelement(s,30);
//popping elements
popelements(s);
popelements(s);
//checking empty stack if yes throw exception
try {
	popelements(s);
}
catch(EmptyStackException r) {
	System.out.println("stack empty");
}
	}

	private static void popelements(Stack<Integer> s) {
		// invoked pop() method
		Integer i=(Integer)s.pop();
		System.out.println("pop"+i);
		System.out.println("stack"+s);
		
		
	}

	@SuppressWarnings("removal")
	private static void pushelement(Stack<Integer> s, int i) {
		// invoked push() method
		s.push(new Integer(i));
		System.out.println("push"+i);
		System.out.println("stack"+s);
		
	}

}
