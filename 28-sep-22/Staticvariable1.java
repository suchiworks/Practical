package sep28Assg;

public class Staticvariable1 {

	int rollno;
	String name;
	float fee;
	static String college="SRM";
	//static void change(){
	//college="ITC";}
	//CONSTRUCTOR
	Staticvariable1(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);}
		public static void main(String[]args) {
		//Staticvariable1.change();
			//objects
		StaticMethod s1=new StaticMethod(111,"ram",5000);
		StaticMethod s2=new StaticMethod(555,"amit",6000);
		s1.display();
		s2.display();
	}
}
