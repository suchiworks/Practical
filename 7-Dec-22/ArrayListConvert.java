package prac7DecCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List al1 = new ArrayList(); //non - generic
		List<String>a1=new ArrayList<String>();//creating a arrayList
		a1.add("Rose");
		a1.add("Sunflower");
		a1.add("Lily");
		a1.add("Daisy");
		a1.add("Marigold");
		a1.add("Tulip");
		a1.add("Jashmine");
		
		//convertion of list to array
		System.out.println("list to Array");
	    String[] arr=a1.toArray(new String[a1.size()]);
	    for(String s: arr) {
		System.out.println(s);
		
		//array to list
		System.out.println(" Array of list");
        List<String>all=new ArrayList<String>();
		all=Arrays.asList (arr) ;
		System.out.println(all);
	}

	
	}}
