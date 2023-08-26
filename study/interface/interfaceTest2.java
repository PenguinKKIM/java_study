package study;

interface I2{
	public void x();
}
interface I1{
	public void y();
}

class All implements I1, I2 { //하나의 클래스에 여러개의 인터페이스를 받을수있다
	public void x() {}; //받은 인터페이스의 메소드는 모두 구현해야한다
	public void y() {};
}

public class interfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
