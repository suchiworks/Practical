package prac7DecCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {
	public static void main(String[] args) {
List<String>a1=new ArrayList<String>();


a1.add("Rose");
a1.add("Sunflower");
a1.add("rose");
a1.add(0,"Lily");
a1.add(2,"Daisy");
a1.add("Marigold");
a1.add(6,"Tulip");
a1.add("Jashmine");
a1.add("Orchid");
a1.add("Lotus");
a1.add(5,"Lavender");
a1.add("pallabi");
System.out.println(a1);
System.out.println("Size of Array List: "+a1.size());
		System.out.println("element of index value is: "+a1.get(6));
		a1.remove(6);
		System.out.println(a1);
		System.out.println("Size of array list: "+a1.size());
	}

}
