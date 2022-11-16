package prac15Nov;

class MultiCatch {
static void mFunc() {
	try {
 int i=50/0; //Arithmetic //50/2
System.out.println(i); //Airthmatic
int arr[]=new int[3]; // Arithmeticindexoutofbound
arr[4]=24;
	}
	catch(ArithmeticException e) {
		System.out.println("Only 1st Arithmetic Exception will execute");}
	
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("Now Array index out of bound will occur");}
	finally {
		System.out.println("i am finally block");}
}
	public static void main(String[] args) {
		mFunc();

	}

}
