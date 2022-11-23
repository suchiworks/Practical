package prac23NovThread;

public class JoinMethod1 extends Thread {
	public void run() {
		for(int i=1;i<=3;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}System.out.println(i);
			}}
		public static void main(String[] args) {
			JoinMethod1 t = new JoinMethod1();
			JoinMethod1 t1 = new JoinMethod1();
			JoinMethod1 t2 = new JoinMethod1();
			t.start();
			try {
				t.join();
			}
			catch (Exception e) {
				System.out.println(e);
			}t1.start();
			t2.start();
		}

}
