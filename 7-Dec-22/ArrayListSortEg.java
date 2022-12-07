package prac7DecCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>a1=new ArrayList<String>();
		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("Marigold");
		a1.add("Tulip");
		a1.add("jashmine");
		a1.add("Orchid");
		a1.add("Lotus");
		a1.add("Lavender");
		System.out.println("String sorted List: ");
		Collections.sort(a1);
		for(String a: a1) {
			System.out.println(a);
		}
		List<String>al1=new ArrayList<String>();
al1.add(20, null);
al1.add(60, null);
al1.add(20, null);
al1.add(10, null);
al1.add(67, null);
al1.add(98, null);
al1.add(5, null);
al1.add(13, null);
al1.add(11, null);
al1.add(94, null);
System.out.println("Integer sorted List:");
Collections.sort(al1);
for(String i: al1){
		System.out.println(i);
	}
Collections.reverse(al1);
System.out.println(al1);

}}
