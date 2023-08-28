package arr_exc;

public class Exc16 {

	public static void main(String[] args) {
		// 배열을 생성한다
		int[][] arr = new int[5][6];
		// 첫번째 행만 1로 초기화
		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = 1;
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j< arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

}
