package prac9NovString;
//append() insert() replace() delete() 
public class BUffer {
public static void my() {
	//StringBuffer
	StringBuffer s=new StringBuffer("hello");
	s.append("World");
	System.out.println("String is: "+s);//Hello world
	s.insert(2, "Riya");
	System.out.println("insert is: "+s);//Heriyallo world
	s.replace(1,3, "java");
	System.out.println("replace is: "+s);//Hjavaiyallo World
	System.out.println("capacity is: "+ s.capacity());
    //StringBuilder
	StringBuilder s1=new StringBuilder("world");
	s1.replace(1,3,"java");
	System.out.println("replace is: "+s1);//Wjavald
	s1.delete(1,3);
	System.out.println("delete is: "+s1);//Wvald
	s1.reverse();
	System.out.println("reverse is: "+s1);//dlavw

	}
public static void main(String[]args) {
	my();
}
}
