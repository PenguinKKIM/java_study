import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(30);
		ts.add(150);
		
		System.out.println(ts); //자동정렬
		TreeSet<Person> pts = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.age - o2.age;
			} //나이순으로 정렬, compare에서 가져온게 우선순위가된다
			
		});
		//비교가 들어가기때문에 compareTo를 오버라이딩 해줘야한다
		pts.add(new Person("Peng", 10));
		pts.add(new Person("kim", 20));
		pts.add(new Person("June", 50));
		pts.add(new Person("Hee", 30));
		pts.add(new Person("Hong", 40));
		System.out.println(pts);
		SortedSet<Person> ssp = pts.subSet(new Person("", 20), new Person("", 40));
		System.out.println(ssp); //subSet에 지정한 조건만 출력한다.
	}

}
