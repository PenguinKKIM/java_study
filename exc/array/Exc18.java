package arr_exc;

import java.util.Scanner;

/**
 * 입력 데이터수 : 95 199 85 77 60
 * 
 * 
 * 출력
 * 최대값 : 60
 * 최소값 : 100
 *  
 *  */



public class Exc18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 데이터수 :");
		int input = sc.nextInt();

		int[] arr = new int[input];
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]< min) min = arr[i];
			if(arr[i]> max) max = arr[i];
		}
		System.out.println("최소값 " + min);
		System.out.println("최대값 " + max);
		
	}

}
