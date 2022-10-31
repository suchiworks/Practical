package lab31oct;

public class ArrayExample {

	public static void main(String[] args) {
		//declaration
		String[] names= {"pallabi","shifa","niladri","akshaya","soumya","Ajitha"};
		//for loop
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
System.out.println();
//declaration
int [] phone= {123,456,789,955,333,555,111,2345,7890};
//for each loop
for(int n:phone) {
	System.out.println(n);
}
	}

}
