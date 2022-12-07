package prac7DecCollection;

import java.util.ArrayList;
import java.util.List;
public class ArrayListMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>a1=new ArrayList<String>();
		a1.add("Ram");
		a1.add("Sam");
		a1.add("Rose");
		a1.add("Lisa");
		a1.add("David");
		a1.add("Maria");
		/*List<String>al1=new ArrayList<String>();
		al1.add(12);
		al1.add(15);
		al1.add(32);
		al1.add(47);
		al1.add(78);
		al1.add(52);
		
		Collection.sort(a1);
		System.out.println("traversing using for loop");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}*/
		
		String element=a1.get(2);
		System.out.println("Get index: "+element);
		System.out.println("Array list is: "+a1.isEmpty());
		String element1=a1.remove(4);
		System.out.println("Remove index: "+element);
		System.out.println("traversing using for loop");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
	}

}
