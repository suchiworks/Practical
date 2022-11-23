package prac23NovThread;
//directly we use thread class without extends
//with & without set name we can name the thread

public class ThreadEg {
public void run() {
	System.out.println("Soumya");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread("pallabi");
Thread t1=new Thread();
t.start();
t1.start();
t1.setName("Anudip");
System.out.println("Thread 0:"+t.getName());
System.out.println("Thread 1:"+t1.getName());
	}

}
