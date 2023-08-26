package study;

//인터페이스도 상속이된다
interface J {
	public void z();
}

interface J2 extends I {
	public void y();
}

class U implements J2 {
	public void z() {};
	public void y() {} // 상속한 인터페이스의 모든 메소드를 구현해야 에러가 안난다
	
	@Override
	public void thisIsInterface() {
		// TODO Auto-generated method stub
		
	}

}

public class interfaceTest3 {

}
