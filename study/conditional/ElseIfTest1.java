package study;

public class ElseIfTest1 {

	public static void main(String[] args) {
		if(true) {
			System.out.println("조건절이 참일때 실행");
		} else if(false) {
			System.out.println("if의 조건절이 거짓일때 else if 의 조건절을 연산하여 참일 실행");
		} else {
			System.out.println("모든절이 거짓일때실행");
		}
	}

}
