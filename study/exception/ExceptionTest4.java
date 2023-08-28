
public class ExceptionTest4 {
	public static void method() throws Exception{
		String str = null;

		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("메소드 1에서처리");
//			throw e;
			throw new Exception("예외 다시 생성");
		}

	}

	public static void main(String[] args) throws Exception {
		try {
			method();
		} catch (NullPointerException e) {
			System.out.println("메인에서 처리");
		}
		// 최종 메인에서 묶어서 처리할수있다
		System.out.println("메인에서 나머지 처리");
	}

}
