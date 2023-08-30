import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(); 
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
	 Enumeration<Integer> e = vector.elements();
	 
	 while(e.hasMoreElements()) {
		 System.out.println(e.nextElement());
	 }
	 
	 ArrayList<Integer> list = new ArrayList<>();
	 list.add(100);
	 System.out.println();
	 ListIterator<Integer> lit =  list.listIterator();
	 while (lit.hasNext()) {
		 System.out.println(lit.next());
	 }
	 System.out.println();
	 while (lit.hasPrevious()) {
		 System.out.println(lit.previous());
	 }
		
		
	}

}
