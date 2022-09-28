package sep28Assg;

public class Thiskeyword {

	int rollno;
	String name;
	float fee;
	//constructor
	Thiskeyword(int rollno, String name,float fee){
		rollno=rollno;
		name=name;
		fee=fee;
	}
	//method
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
	public class Test{//inner class2
	public void main(String[] args) {
		// objects
		Thiskeyword s1=new Thiskeyword(111,"pallabi",5000);
		Thiskeyword s11=new Thiskeyword(555,"amit",6000);
		s11.display();
		s1.display();
	}}}


	