package prac12DecStack;
public class Vector {
	public static void main(String[] args) {

		java.util.Vector<String> vc = new java.util.Vector<String>(4);

//adding elements to a vector
vc.add("Dog");
vc.add("Cat");
vc.add(0,"Tiger");
vc.add("Lion");

System.out.println("Size:"+vc.size());
System.out.println("size:"+vc.capacity());
vc.addElement("cow");
vc.addElement("cow");

System.out.println("after adding elements:");
System.out.println("Size:"+vc.size());
System.out.println("Size:"+vc.capacity());

System.out.println(vc);
if(vc.contains("Cat")) {
	System.out.println("\n Element present"); }
	else {
		System.out.println("Not present"); }

//getting first elements
System.out.println("\n 1st elements: "+vc.firstElement());
System.out.println("last elements: "+vc.lastElement());
System.err.println("index"+vc.indexOf("cat"));
	}

}
