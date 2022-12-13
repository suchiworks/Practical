package prac12DecStack;

import java.util.Deque;

public class ArrayDequedemo {
	private static String[] deque;
	private static char[] str;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq=new java.util.ArrayDeque<String>();
		dq.add("Pallabi");
		dq.add("subhrajit");
		dq.add("mamata");
		dq.add("monami");
		dq.offerFirst("Anju");
		System.out.println("after offer First");
		dq.offerLast("Monalisa");
		System.out.println("after offer Last");
		//traversing
		for(String str:deque);
			System.out.println(str);
			//deque.peek() & deque.peekFirst same as peek()
	//}
	//System.out.println("peek:"+deque.peekLast());});
	//System.out.println("peek:"+deque.peekLast());}
		//System.out.println("After peek Last");
		for(String str1:deque) {
			System.out.println(str1);
			//deque.poll() & deque.pollFirst same as poll()
			System.out.println("poll:"+deque.length);
			System.out.println("After poll Last");
			for(String str:deque) {
				System.out.println(str);
				System.out.println();
			}}}}
	
