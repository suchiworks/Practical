package prac30NovIO;

public class FileOutputStream {
	//write byte from string
public FileOutputStream(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String [] args) {
	try {
		FileOutputStream f=new FileOutputStream("D:\\test.txt");//Destination
		String s= "welcome to anudip foundation";
		byte b[]=s.getBytes();//converting string into byte array
		f.write(b);
		f.close();
		System.out.println("done");
	}
	catch(Exception e) {
		System.out.println(e);
}}
}
