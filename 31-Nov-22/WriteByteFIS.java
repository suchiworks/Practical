package prac30NovIO;
import java.io.FileInputStream;
public class WriteByteFIS {

	public static void main(String[] args) {
try {
	FileOutputStream f=new FileOutputStream("E:\\test.txt");
	//read all character
	int i=0;
	while((i=f.read()))
		if(i!=-1) {
			System.out.println((char)i);}//convert it into character
	f.close();
}
catch(Exception e) {
	System.out.println(e);
	
		}
}
	}


