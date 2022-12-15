package prac14DecMapping;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> map2= new TreeMap<Integer,String>();
map2.put(101, "Mango");
map2.put(108, "Orange");
map2.put(105, "Banana");
map2.put(103, "Grapes");
//map2.put(105, "Chiku");
//map2.put(null,null);
//map2.put(102, null);
//map2.put(null, "Apple");
System.out.println(map2);
for(Map.Entry m: map2.entrySet()) {
	//System.out.println(m.getKey()+" "+m.getValue());
	//System.out.println("-------");
map2.putIfAbsent(102, "CustardApple");
map2.putIfAbsent(101, "Watermelon");
System.out.println("--------");
for (Map.Entry m : map2.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}
	map2.remove(103);
	System.out.println("--------");
	System.out.println("After Removal");
	for(Map.Entry m: map2.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}}}}
