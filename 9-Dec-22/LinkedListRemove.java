package prac9thDecCollection;

import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> r= new LinkedList<String>();//create list
		  r.add("Arnab");
		 r.add("Abhisek");
		 r.add("Akash");
		r.add("Avik");
		 r.add("Avik");
		 r.add("Amit");
		     System.out.println("Lit 1 elements:"+" "+r);
			 LinkedList<String> rs= new LinkedList<String>();//create list
rs.add("peso");
rs.add("shifa");
rs.add("elijah");
System.out.println("List 2 elements:"+""+rs);
//adding new elements to the list a
rs.addAll(rs);
System.out.println("After adding new elemnts:"+""+rs);
//remove list 1
rs.remove("Akash");
System.err.println("after removing"+""+rs);
//remove specific elements perticular position
rs.remove(1);
System.out.println("after removing particular position:"+""+rs);
//remove all new elements of list 2
rs.removeAll(rs);
System.err.println("after removing all new elements:"+""+rs);
//remove 1st elements of list
rs.removeFirst();
System.out.println("removing first:"+""+rs);
//remove last elements of list
rs.removeLast();
System.out.println("removing Last"+""+rs);
//adding new elements to the list 1
rs.add("pallabi");
rs.add("anu");
rs.add("java");
rs.add("pallabi");
rs.add("collection");
System.out.println("updated list elements:"+""+rs);
//remove first occurance of leemnnts
rs.removeFirstOccurrence("pallabi");
System.out.println("removing 1st occurance:"+""+rs);

	}

}
