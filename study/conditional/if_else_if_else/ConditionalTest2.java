package study;

public class ConditionalTest2 {

	public static void main(String[] args) {
		if (true) { //false면 여기는 실행되질 않고
			System.out.println("참이면 이쪽문이 먼저 실행");
		}
		System.out.println("거짓이면 이쪽문만 실행");
		//if 문 바깥쪽만 실행이된다
	}

}
