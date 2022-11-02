package prac2Nov;

public class MultArray {

	public static void main(String[] args) {

		// create matrix
				int a[] []= {{1,2,3},{4,5,6}};
				int b[][]= {{10,20,30},{11,21,31}};
				//for storing result creating another matrix
				int c[][] =new int[2][3];
				//logic and printing
				for(int i=0; i<2; i++) {      //row
					for(int j=0; j<3; j++) {   //column
		c[i][j]=a[i][j]*b[i][j];
		System.out.print(c[i][j]+" ");
				}
					System.out.println( );
		}}}
	
