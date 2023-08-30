import java.util.ArrayList;
import java.util.List;

public class ArrayListTest05 {

	static void print (Object[] arr) {
		for(int i =0; i <arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(5);
		list1.add(10);
		list1.add(2);
		list1.add(4);
		list1.add(3);
		list1.add(0);
		list1.add(1);
		System.out.println(list1); //반복문을 안 돌려도 볼수있다.
		print(list1.toArray());
		
		List list2 = (List)list1.clone();//복제한다
		list2.set(0, 100);
		System.out.println(list2);
	}

}
