
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest01 {

	public static void main(String[] args) {
//		HashSet<Integer> hss = new HashSet<>(Arrays.asList(231,45,23,8,1));
//		//set 이라서 중복허용X 순서도 상관없다.차례대로들어가지 않는다
//		for (Integer n : hss) {
//			System.out.print(n + ",");
//		}

		HashSet<Person> phs = new HashSet<>();
		phs.add(new Person("홍길동", 40));
		phs.add(new Person("홍길동", 30));
		phs.add(new Person("하길동", 30));
		phs.add(new Person("고길동", 20));
		phs.add(new Person("고길동", 20));

		for (Person p : phs) {
			System.out.println(p);
		}
	}
}
