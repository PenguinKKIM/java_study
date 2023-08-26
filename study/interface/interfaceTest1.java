package study;

interface I {
	public void thisIsInterface(); //추상클래스 처럼 몸통이없다

}

class A implements I { //implements : 인터페이스를 받을때 써야하는 예약어(?) 
	public void thisIsInterface() {}; //반드시 인터페이스의 메소드를 구현해야한다
}


//외부에서 제어를 해야함으로, public 이 아니면 컴파일 에러가 난다

public class interfaceTest1 {

	public static void main(String[] args) {
		
	}

}
