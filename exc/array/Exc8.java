package arr_exc;

import java.util.Arrays;

public class Exc8 {
	public static void main(String[] args) {
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 }; //여기 숫자가 4종류라는걸 모르면 어카지 ??
		int[] counter = new int[4]; 
		
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
		System.out.println(); //숫자를 정렬해서 출력할수있는 방법이 없나 찾아본것
		
		for (int i = 0; i < answer.length; i++) {
			/**
			 * answer[1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4]
			 * counter[0 3 3 2 0 3 3 1 0 2 1]++
			 * counter[0]인덱스(첫번째 배열)에 1을 + 함
			 * 즉 answer 의 배열중 숫자 1이 counter 의 인덱스 0으로 들어감 
			 * */
			
			counter[answer[i] - 1]++;
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.print(i + 1+"이(가) "+counter[i] + "개" + " :  ");
			
			for (int j = 0; j < counter[i]; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
