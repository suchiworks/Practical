package sep27Assg;

public class Defaultcon {
/*void Defaultcon(){
	System.out.println("Default constructor ids created");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Defaultcon d=new Defaultcon();*/
	int age;
			String name;
	void show() {
		
		   System.out.println(age+"  "+name);}
	public static void main(String[]args) {
		Defaultcon d=new Defaultcon();
		Defaultcon d1=new Defaultcon();
		d.show();
		d1.show();
	}
}
