package prac29NovSyncThread;

public class  A{
int num;
boolean valueSet = false;//a=10
public synchronized void put(int num) {
	while(valueSet) {//a=20
		try { wait();}
		catch(Exception e) {}
		System.out.println("put:"+num);
		this.num=num;
		valueSet=true;
		notify();
	}
}
public synchronized void get() {
	while(!valueSet) {//a=10
		try {
			wait();
		}catch(Exception e) {}
	}
	System.out.println("Get:"+num);
	valueSet=false;
	notify();
		}
class producer implements Runnable{
	A a;
	public producer (A a) {
		this.a=a;
		Thread t2= new Thread(this,"producer");
		t2.start();}

public void run() {
	int i=0;
	while(true) {
		a.put(i++);
		try {Thread.sleep(1000);}
		catch(Exception e) {}
	}
}
class Consumer implements Runnable{
	A a;
	public Consumer (A a) {
		this.a=a;
		Thread t2= new Thread(this,"consumer");
		t2.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(1000);
			}}}
			catch(Exception e) {}
}
public class Main{
	public static void main(String args[]) {
		// TODO Auto-generated method stub
A a=new A();
new producer(a);
new Consumer(a);
	}
}}}
