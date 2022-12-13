package prac12DecStack;
import java.util.Deque;

public class ArrayDeque {
	public static void main(String[] args) {
		Deque<String> dq=new java.util.ArrayDeque<String>();
		dq.add("Ram");
		dq.add("Karan");
		dq.add("Riya");
		dq.add("Priya");
		dq.add("Sam");
		dq.add("Ajay");
//System.out.println(dq);
dq.addFirst("Shree");
dq.addLast("Neha");
System.out.println("New list");
for(String s1:dq) {
	System.out.println(s1);
dq.removeFirst();
dq.removeLast();
System.out.println("new List After Removal");
for(String s2:dq) {
	System.out.println(s2);
}}}}
