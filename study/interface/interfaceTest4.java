package study;

//인터페이스는 변경하는부분을 줄여준다



class A1 {
	public void method(I01 i) {
		i.method(); //이부분을 변경하지 않아도됨
	}
}

interface I01 {
	public void method();
}

class B1 implements I01{
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C1 implements I01{
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class interfaceTest4 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.method(new C1()); //a1가 b1을 사용

	}

}
