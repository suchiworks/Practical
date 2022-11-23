package prac18NovThread;
//threading
class ThreadExample extends Thread {
	public void run() {
		System.out.println("i am thread.. threading is running");}
		public static void main(String[] args) {
	    ThreadExample t=new ThreadExample();
	    t.start();
	    t.setName("pallabi");
	    String s=t.getName();
	    System.out.println(s);
		}
		}
	
