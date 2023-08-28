package arr_exc;

import java.util.stream.IntStream;

//다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. 
//(1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
public class Exc05_1 {
	public static void main(String[] args) {
		//int stream을 써서 1부터 9까지 숫자를 넣음 (하나하나 넣을 필요없음)
		int[] ballArr = IntStream.rangeClosed(1, 9).toArray();
		int[] ball3 = new int[3];

		// 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
		for (int x = 0; x < 20; x++) {
			int i = (int) (Math.random() * ballArr.length);
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;

			tmp = ballArr[i]; 
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		for(int i =0;i< ball3.length; i++) {
			ball3[i]= ballArr[i];
		}
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i] + "  ");
		}
	}
}
