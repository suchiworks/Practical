package sep29lab;
//single inheritance
public class Vehicle {//parent class A
void running() {
	System.out.println("running mode on");
}
class Bike extends Vehicle{//child class b
	void run() {
		System.out.println("Bike run mode on");}
}
class Vehicle1{
	
	     
	public void main(String[] args) {
		Bike d=new Bike();
		d.run();
		d.running();
	}
}}