package prac12DecStack;

import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> queue=new PriorityQueue<String>();
queue.add("Prakash");
queue.add("Babai");
queue.add("Sankhjai");
queue.add("Hasan");
queue.add("Bumba");
queue.add("Owashim");
queue.add("Tanmoya");
System.out.println("head:"+queue.element());
System.out.println("Queue:"+queue);
System.out.println("head:"+queue.peek());
System.out.println("Queue:"+queue);
/*Iterator itr=queue.iterator();
 * while(ite.hasNext(){
 * syso(itr.next());}*/

System.out.println("head:"+queue.poll());
System.out.println("Queue:"+queue);
System.out.println("head:"+queue.remove());
System.out.println("Queue:"+queue);
System.out.println("afetr removing");

/*Iterator itr=queue.iterator();
 while(ite.hasNext(){
 System.out.println(itr.next());}*/
	}

}
