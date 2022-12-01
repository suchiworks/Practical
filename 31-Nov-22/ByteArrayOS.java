package prac30NovIO;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOS {
public static void main(String[] args) throws IOException{
	FileOutputStream f1=new FileOutputStream("E:\\test.txt");
	FileOutputStream f2=new FileOutputStream("D:\\test.txt");
	ByteArrayOutputStream b=new ByteArrayOutputStream();
	
	bout.write(65);
	bout.writeTo(f1);
	bout.writeTo(f2);
	bout.flush();
	bout.close();
	System.out.println("done");
}
}
