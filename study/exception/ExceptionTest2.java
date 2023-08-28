
public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		int[] arr2 = { 2, 4, 6, 0, 10 };
		int total = 0;
		int count = arr1.length;
		double avg = 0;

		// 나머지가 0이거나 갯수가 모자란건 avg에 들어가지않는다
		for (int i = 0; i < arr1.length; i++) {
			try {
				total += arr1[i] / arr2[i]; // 합(arr1[i]/arr2[i])
//				System.out.println(arr1[i]/arr2[i]); //0을 나누면 err
			} catch (ArithmeticException e) { 
//				System.out.println(e.getMessage());
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println(e.getMessage());
				count--;
			} catch (Exception e) { //Exception이 상속관계가 제일 크므로 제일 밑에,(죽지않게만 한다)
				//내용 없어도됨
			} 
		} // for 끝
		System.out.println(total);
		System.out.println(total / (double) count);// count 에서 예외가발생하면 뺀다
		System.out.println("종료");
	}

}
