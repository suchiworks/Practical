package prac9thDecCollection;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkListEg1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    LinkedList<String> r= new LinkedList<String>();//create list
r.add("Arnab");
r.add("Abhisek");
r.add("Akash");
r.add("Avik");
r.add("Avik");
r.add("Amit");
    System.out.println(r);
      Iterator<String>=r.iterator();
      while(itr.hasNext())
	System.out.println(itr.next());
//adding an element at the specific position
r.add(2,"Nisha");
    System.out.println("After adding: "+" "+11);
    LinkedList<String> r1= new LinkedList<String>();
r1.add("peso");
r1.add("Shifa");
r1.add("Elija");
//ading all 2nd list elements to the 1st list
r1.addAll(112, r1);
	System.err.println("After adding all elements of list2: "+""+11);
	//aading all 2nd list elements to the list at a specific position
r1.add(2,112);
	System.err.println("After adding all elements of list2 at specific position: "+" "+11);
	//adding elements at the 1st position
	r1.addFirst("pallabi");
	System.out.println("Add elements at 1st:"+""+112);
	//adding elements at the last position
	r1.addLast("Subhrajit");
	System.out.println("Add elements atlast:"+""+112);
	}

}
