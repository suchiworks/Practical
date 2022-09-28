package sep28Assg;

public class StaticMethod {

	int rollno;
	String name;
	float fee;
	//static method to change the value of static variable
	static void change() {//static method
		college="ITC";}
	//CONSTRUCTOR
	StaticMethod(int rollno, String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;}
	static String college="MIT";
		//method
		void display() {
			System.out.println(rollno+" "+"name"+" "+college);
		}
		public class StaticMethod1{//class2
			
			public void main(String[]args) {
				//calling static method with class name
				StaticMethod.change();
				//creating object
				StaticMethod s1=new StaticMethod(102,"ram",5000);
				StaticMethod s2=new StaticMethod(222,"sham",3000);
				s1.display();
				s2.display();

			}
		}}


