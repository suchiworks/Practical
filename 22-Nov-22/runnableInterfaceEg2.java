package prac18NovThread;
//Thread()Runnable obj.string name)
class runnableInterfaceEg2 implements Runnable{
public void run() {
	System.out.println("Thread running");}
	public static void main(String[] args) {
        Runnable ri=new runnableInterfaceEg2();
		Thread t=new Thread(ri,"pallabi");
		t.start();
		String s=t.getName();
		System.out.println(s);

	}

}
