package sep27Assg;

public class ParameterCon {
	int age;
	String name;
	ParameterCon(int a,String n){
		age=a;
		name=n;
	}
	void show() {
		System.out.println(age+" "+name);}
	public static void main(String[] args) {
		ParameterCon d=new ParameterCon(50,"karan");
		ParameterCon d1=new ParameterCon(25, "rohit");
		d.show();
		d1.show();
	}


	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
