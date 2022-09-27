package sep27Assg;

public class Copyconst {
int age;
String name;
Copyconst(int a,String n){
	age=a;
	name=n;
}
Copyconst(Copyconst c){//this thing is copyconst
	                    //initialize another object
	age=c.age;
	name=c.name;
}
/*Copyconst(){}*/
void show() {
	System.out.println(age+" "+name);}
	public static void main(String[] args) {
		Copyconst c1=new Copyconst(22,"pallabi");
		Copyconst c2=new Copyconst(c1);
	      c1.show();
	      c2.show();
	    /* Copyconst c1=new Copyconst();
	     * c2.age=c1.age;
	     * c2.name=c1.name;*/

	}

}
