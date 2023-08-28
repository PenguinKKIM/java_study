class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() { //클래스의 내용을 문자열로 만들어줌
		return "이름 : " + name + " 나이 : " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person == false) return false;
		Person p = (Person)obj;
		return name.equals(p.name) && age == p.age;
	}
	
	
}

public class ToStringTest1 {

	public static void main(String[] args) {
		Person pr1 = new Person("Kim", 20);
		Person pr2 = new Person("Kim", 20);
		
		System.out.println(pr1 == pr2);//객체생성된 주소값을 비교한다
		System.out.println(pr1.equals(pr2));  //같은 내용 인지 비교함
	}

}
