class TClass {
	void method1() {
		int num1;
		method2();
	}

	void method2() {
		int num2;
		method3();
	}

	void method3() { //메소드들 끼리도 서로 호출이 가능하다
		int num3;
	}
}

public class ClassTest4 {

	public static void main(String[] args) {
		TClass tc = new TClass ();
		tc.method1(); //method1 만불렀지만 2, 3도 전부 호출된다 (레퍼런스 변수없이)
	}

}
