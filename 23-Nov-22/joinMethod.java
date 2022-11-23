package prac23NovThread;

public class joinMethod extends Thread {
	public void run() {
		try {
			Thread.sleep(500);
		}catch(Exception e)
		{System.out.println(e);
		}
		System.out.println(9);
	}
	public static void main(String[] args) {
joinMethod t=new joinMethod();
joinMethod t1=new joinMethod();
joinMethod t2=new joinMethod();
try {
	t.join();
}
catch(Exception e) {
	System.out.println(e);}
t1.start();
t2.start();}}

	