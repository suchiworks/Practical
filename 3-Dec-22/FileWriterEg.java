package prac3Dec;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fw=new FileWriter("D:\\test3.txt");//write
	fw.write("hello");//print
	fw.close();
	System.out.println("\n done");
} catch (IOException ae) { // input output exception
	System.out.println("e");
}
	}

}
