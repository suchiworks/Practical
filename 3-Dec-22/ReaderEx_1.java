package prac3Dec;

import java.io.FileReader;

public class ReaderEx_1 {
public static void main(String[] args) {

	try {
		
		FileReader fr=new FileReader("D:\\Test1.txt");//File Reader Class
		int i;
		while(( i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}