package exc;

public class Exc8 {
	public static void main(String[] args) {
		//방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		for (int x=0; x<=10; x++) {
			for (int y=0; y<=10; y++) {
				if(2*x+4*y==10) {
					System.out.println(String.format("x = %d, y= %d" , x, y ));
				}
			}
		}

	}
}
