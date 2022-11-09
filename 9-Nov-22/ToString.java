package prac9NovString;

public class ToString {
int RollNo;
String Name,Address;
ToString(int rollno,String name,String address){
	this.RollNo=rollno;
	this.Name=name;
	this.Address=address;}
public String toString() {
	return RollNo+" "+Name+" "+Address;}
public static void main(String...args) {
	ToString S1=new ToString(123,"suchi","cuttack");
	ToString S2=new ToString(124,"gudu","cuttack");
	System.out.println(S1);
	System.out.println(S2);
}
}
