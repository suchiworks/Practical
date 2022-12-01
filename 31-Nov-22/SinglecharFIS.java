package prac30NovIO;
import java.io.FileInputStream;
//read single character
public class SinglecharFIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream f=new FileInputStream("D:\\test.txt");//Destination
int i=f.read();
	System.out.println((char)i);//convert it into character

f.close();
}
catch(Exception e) {
	System.out.println(e);}
}
	}


