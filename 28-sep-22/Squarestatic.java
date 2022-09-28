package sep28Assg;

public class Squarestatic {

	int a=20;
	static int square(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		//int a=20;
		int result=Squarestatic.square(2);
		System.out.println(result);
		//System.out.println(a);
	}

}
