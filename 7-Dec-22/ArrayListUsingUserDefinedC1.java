package prac7DecCollection;
import java.util.ArrayList;
public class ArrayListUsingUserDefinedC1 {
	public static void main(String[] args) {

		Bank b= new Bank(12345, "pallabi",5000,67,20 );
		Bank b1= new Bank(12354, "Ram",7000,67,21 );
		Bank b2= new Bank(12344, "Sam",5400,67,30 );
		Bank b3= new Bank(12333, "Karan",4000,67,22 );
		Bank b4= new Bank(12322, "Priya",8000,67,55 );
		Bank b5= new Bank(12355, "pooja",90bank7,38 );
		
		ArrayList<Bank>a1 = new ArrayList<Bank>();
		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		a1.add(b4);
		a1.add(b5);
		
		Iterator itr= a1.iterator();
		while (itr.haeNext()) {
			bank obj= (Bank) itr.next();
			System.out.println
(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);
			
		}


	}

}
