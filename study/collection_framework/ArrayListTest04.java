import java.util.ArrayList;
import java.util.List;

public class ArrayListTest04 {
	
	static void print (List<Integer>list) {
		for (Integer n : list) {
			System.out.print(n + ",");
		}
		System.out.println();
	}
	
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(10);
		list1.add(2);
		list1.add(4);
		list1.add(3);
		list1.add(0);
		list1.add(1);
		
		List<Integer> list2 = list1.subList(1, 4);
		print(list1);
		print(list2);
		System.out.println(list1.containsAll(list2));
		
		list1.retainAll(list2);
		print(list1);
		list1.add(0, 6); //삽입임 : 0번째에 6삽입
		print(list1);
		
		System.out.println();
		list1.set(0, 7); //삽입임 : 0번째에 10으로 변경
		print(list1);
		
		System.out.println();
		list1.add(0, 7); //삽입임 : 0번째에 10으로 변경
		print(list1);
		
		System.out.println();
		list1.remove(new Integer(7)); //삽입임 : 0번째에 10으로 변경
		print(list1);

	}
}
