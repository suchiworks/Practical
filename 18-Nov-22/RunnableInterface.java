package prac18NovThread;

class RunnableInterface implements Runnable {

	public void run() {
System.out.println("iam thread.. thraed is running");}
public static void main(String[]args) {
	RunnableInterface r1=new RunnableInterface();
	Thread t=new Thread(r1);
	t.start();
}
	
}
