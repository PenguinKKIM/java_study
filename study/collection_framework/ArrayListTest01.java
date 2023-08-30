
import java.util.ArrayList;

class Person implements Comparable<Person> {
	String name;
	int age;

	Person() {
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
//		return age - o.age; //퀵소트
	}

	@Override
	public String toString() {
		return "<"+name + "," + age+">";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false)
			return false;
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}

public class ArrayListTest01 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);// boxing
		int n = (Integer) al.get(0);// 캐스팅해줘야한다

		ArrayList al2 = new ArrayList();
		al2.add(new Person());
		Person p = (Person) al2.get(0);

		ArrayList<Person> al3 = new ArrayList();
		al3.add(new Person());
		Person p2 = al3.get(0);

	}

}
