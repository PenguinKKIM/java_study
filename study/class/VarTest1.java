class MyClass {
	int num; //정의만 되어있음, 여기서는 지역변수지만
	static int snum;
	void setNum(int n) {
		
	};
}



public class VarTest1 {

	public static void main(String[] args) {
		int n; //메모리 차지, 초기화 꼭해야함 > 지역변수 
		MyClass mc = new MyClass(); //여기서 생성된다 > 자동 초기화
		
		System.out.println(mc.num); //이미 new 에서 초기화가되어서 에러가안남
//		System.out.println(n); //초기화 해야함으로 컴파일 에러
	}

}
