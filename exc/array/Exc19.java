package arr_exc;

import java.util.Scanner;

/**
 * 
 * 행렬크기
 * 
 * 1000000
 * 1100000
 * 1010000
 * 1001000
 * 1000100
 * 1000010
 * 1000001
 * 
 * */



public class Exc19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행렬크기 :");
		int size = sc.nextInt();
		
		int[][] matrix = new int [size][size];
		
		for(int i = 0; i < size; i++) {
			matrix[i][i] = 1;
		}
		
		for(int i = 1; i<size; i++) {
			for (int j = 0; j < i; j++) {
				matrix[i][j] = matrix[i-1][j];
				if(j>0) {matrix[i][j] += matrix[i-1][j-1];}
			}
		}
		
		for (int i = 0; i <size; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(String.format("%4d", matrix[i][j]));
			}
			System.out.println();
		}
		
		
	}

}
