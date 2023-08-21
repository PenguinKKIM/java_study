class MyMath{
	int add(int x, int y) {
		int result = x + y;
		return result;//함수가 호출될때 사용, 리턴되면 사라짐 <스택의 영역
	}
}





public class MethodTest1 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		int res = mm.add(10, 20); //호출시 입력값이있어야한다
		System.out.println(res);

	}

}
