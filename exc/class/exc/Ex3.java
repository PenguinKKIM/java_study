package exc;

//[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
//[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.


public class Ex3 {
	
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
	}
	
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
