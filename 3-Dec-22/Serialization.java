package prac3Dec;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//writing state of an object into byte-stream  -SERIALIZATION
class Student implements Serializable{
	int id;
	String name;
	int fee;
	Student(int id,String name,int fee){
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
}
public class ObjectOutputeg {
public static void main(String[] args) {
	try { 
		Student s=new Student(101,"Misbah",2000);
		FileOutputStream os=new FileOutputStream("E:\\test1.txt");
		ObjectOutputStream op=new ObjectOutputStream(os);
		op.writeObject(s);
		op.close();
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);	}
}
}
