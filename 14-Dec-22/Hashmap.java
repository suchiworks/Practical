package prac14DecMapping;
import java.util.HashMap;
//keys & value
import java.util.Map;
public class Hashmap {
	public static void main(String[] args) {
HashMap<Integer,String> map= new HashMap<Integer,String>();

map.put(101, "Mango");
map.put(108, "Orange");
map.put(105, "Banana");
map.put(103, "Grapes");
map.put(105, "Chiku");
map.put(null,null);
map.put(102, null);
map.put(null, "Apple");
for(Map.Entry m: map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	System.out.println("-------");
map.putIfAbsent(102, "CustardApple");
map.putIfAbsent(101, "Watermwlon");
HashMap<Integer, String> map1;
for(Map.Entry m1 : map1.entrySet()) {
	System.out.println(m1.getKey()+" "+m1.getValue());
}
//map.remove(103);
//System.out.println(map);
	//}
//}}
	
//key
	System.out.println("keys: "+map1.keySet());
	//value
	System.out.println("Values:"+map1.values());
	//key-value
	System.out.println("keys & value:"+map1.entrySet());
	map1.remove(103);
	System.out.println("After Removal");
	for(Map.Entry m1: map1.entrySet()) {
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
}}}}
	
	
	
	