
public class ExceptionTest3 {

	public static void main(String[] args) {

		try {
			throw new Exception("예외발생");//getMessage를 커스텀(?) 할수있다
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
