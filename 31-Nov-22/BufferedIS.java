package prac30NovIO;

import java.io.BufferedOutputStream;

public class BufferedIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream f=new FileOutputStream("D:\\test.txt");
	BufferedOutputStream b=new BufferedOutputStream(f);
	int i;
	while((i=b.read())!=-1) {
		System.out.println((char)i);//convert it into character
b.close();
	f.close();
	}
	catch(Exception e) {
		System.out.println(e);}
}
	}

}
