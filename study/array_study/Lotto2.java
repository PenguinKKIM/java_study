package array_study;

public class Lotto2 {

	public static void main(String[] args) {
		// 배열6개선언
		int[] ball = new int[6];
		int cnt = 0;

		boolean same = false; // 선택된 볼은 거짓으로바꿈

		
		while (true) {
			int rand = (int) (Math.random() * 45) + 1; // 1부터 45 가져옴
			same = false;
			for (int i = 0; i < cnt; i++) {
				if (ball[i] == rand) { // 중복되는 수 가있으면 break; 중복 검사하는 for문이 끝남
					same = true;
					break;
				}
			}
			if (same == false) { // 랜덤으로 나온수를 ball array에 집어넣음
				ball[cnt++] = rand;
			}
			if (cnt == 6) { // 카운트가 6이되면 break; while이 끝남
				break;
			}
		}
		
		for (int i = 0; i < ball.length; i++) { // 나온수를 한줄로 출력
			System.out.print(ball[i] + "  ");
		}
	}
}
