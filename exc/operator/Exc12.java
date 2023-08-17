package exc;

public class Exc12 {
	// 구구단의 일부분을 다음과 같이 출력하시오. 3중 for 문
	public static void main(String[] args) { 
		for (int i = 0, table = 2; i < 3; i++, table += 3) { //열 과 단
			for (int j = 1; j <= 3; j++) {// 곱해지는 수
				for (int k = table; k <= ((table + 2<10)?table+2:9); k++) { //줄마다 단이 바뀌게됨(문단마다..?)
					System.out.print(String.format("%d X %d = %d\t", k, j, k * j));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
