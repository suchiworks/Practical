package prac9thDecCollection;
import java.util.LinkedList;

  public class LinkedListMethod {
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> r= new LinkedList<String>();//create list
		  r.add("Mishbah");
		  r.add("Abisek");
		  r.add("Atif");
		  r.add("Niladri");
		  r.add("Soumya");
		  r.add("Sourav");
		System.out.println("List 1 elements:"+""+r);
		    
		     //retrives the1st elements of the list by default
		     System.out.println(r.peek());
		    
		     //retrive the1st elements of the list
		     System.out.println(r.peekFirst());
		    
		     //retrives the last elements of the list
		     System.out.println(r.peekLast());
		     
		     //retrives the remove the 1st elements of the list-- by default
		     System.out.println(r.poll());
		     System.out.println("List 1 elements:"+""+r);
		     
		     //retrives the 1st elements of the list
		     System.out.println(r.pollFirst());
		     System.out.println("List 1 elements:"+""+r);
		    
		     //retrives the last elements of the list
		     System.out.println(r.pollFirst());
		     System.out.println("List 1 elements:"+""+r);
		     System.out.println(r.pop());
		     System.out.println("List 1 elements:"+""+r);
		     }

}
