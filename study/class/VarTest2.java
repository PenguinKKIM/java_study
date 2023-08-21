class MyNumber{
	int num;
	void func1(int n) { //클래스내 메서드는 클래스내 메서드 끼리 공유한다
		int number = n;
		number = num;
	}
	
	void func2(int n) {
		int number = n;
		num = number;//이름은 같지만 위와는 다른 변수이다
	}
}

class MyMath2{ 
	int x, y;
	int add() {
		return x+y;
	};
	int multi() {
		return x*y;
	};
}

public class VarTest2 {

	public static void main(String[] args) {
		MyNumber mn = new MyNumber();
		System.out.println(mn.num);
		mn.func1(10);
		System.out.println(mn.num);
		mn.func2(20);
		System.out.println(mn.num);
		
		
		MyMath2 mm = new MyMath2();
		mm.x = 10;
		mm.y = 20;
		System.out.println(mm.add());
		System.out.println(mm.multi());

	}

}
