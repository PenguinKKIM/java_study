package arr_exc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 입력 데이터수 : 5 95 100 85 77 60
 * 
 * 
 * 출력 60 77 85 95 100 //올림차수로 정렬
 */

public class Exc_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 데이터수 :");
		int input = sc.nextInt();

		int[] arr = new int[input];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) { //오름 내림은 부등호만 바꿔주면된다
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " " );
		}
	}

}
