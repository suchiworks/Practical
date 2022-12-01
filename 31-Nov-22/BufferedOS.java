package prac30NovIO;
import java.io.*;
public class BufferedOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream f=new FileOutputStream("D:\\test.txt");
	BufferedOutputStream b=new BufferedOutputStream(f);
	String s="welcome to coding world";
	byte b1[]=s.getBytes();//converting string into byte array
	f.write(b1);
	f.close();
	System.out.println("done");}
catch(Exception e) {
	System.out.println(e);
}
	}

}
