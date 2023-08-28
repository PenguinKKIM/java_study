import java.io.IOException;

public class ExceptionTest6 {

	static void method() throws IOException, Exception {
		boolean flag = false;
		if(flag) {
			throw new IOException("입출력 에러");
		}else {
			throw new Exception("모든 에러");
		}
	}

	public static void main(String[] args) {
		
		try {
			method();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} //catch 는 세분화 할 수록 좋다
	}
}
