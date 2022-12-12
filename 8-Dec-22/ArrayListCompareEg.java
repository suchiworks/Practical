package prac8thDecCollection;
import java.util.ArrayList;
import java.util.List;
public class ArrayListCompareEg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al1 = new ArrayList<String>();//creating array List 1
al1.add("Rose");
al1.add("Sunflower");
al1.add("Lily");
al1.add("Daisy");
al1.add("MArigold");
al1.add("tulip");
al1.add("Jashmine");
System.out.println(al1);
List<String> aal2=new ArrayList<String>();//list2

al1.add("Rose");
al1.add("Sunflower");
al1.add("Lily");
al1.add("Daisy");
al1.add("Marigold");
al1.add("Tulip");
al1.add("Jashmine");
System.out.println(al2);
//compare array list
boolean b=al1.equals(al2);
System.out.println(b);
al1.add("Red ROse"); //add new element
boolean b1=al1.equals(al2);
System.out.println(b1);
	}

}
