package prac30NovIO;

//write byte to string using FOS
import java.io.FileOutputStream;
public class WriteStringsFOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//write byte to string
	FileOutputStream f=new FileOutputStream("D:\\test.txt");//Destination
	f.write(67);
	f.close();
	System.out.println("done");
}
catch(Exception e) {
	System.out.println(e);
}}
}

