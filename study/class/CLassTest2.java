class Person {
	String name;
	int age;

	String info() { // 메서드 정의 기능은 가져다 쓰는것
		return "이름 : " + name + ", 나이 : " + age;
	} // 호출한 애한테 return 해준다

}

public class CLassTest2 {

	public static void main(String[] args) {
		Person per1 = new Person();
		per1.name = "희준";
		per1.age = 34;

		System.out.println(per1.info()); // 메서드 실행(호출)

		Person[] parr = new Person[5]; // 레퍼런스 5개를 생성 한것이다 (객체를 5개만든것이 아님)
		parr[0] = new Person();
		parr[1] = new Person();
		parr[2] = new Person();
		parr[3] = new Person();
		parr[4] = new Person(); // 각각 지정해줘야지 객체가 생성된 것이다.
	}

}
