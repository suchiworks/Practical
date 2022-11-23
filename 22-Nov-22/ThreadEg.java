package prac18NovThread;

public class ThreadEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread("pallabi");
t.start();
String s=t.getName();
System.out.println(s);

	}

}
