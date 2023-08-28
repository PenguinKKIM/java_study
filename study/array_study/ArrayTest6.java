package arr_study2;

public class ArrayTest6 {

	public static void main(String[] args) {
		int[][] narr = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120},
		};
		
		int[][] result = new int[narr.length+1][narr[0].length + 1];

		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr[i].length; j++) {
				
				result[i][j] = narr[i][j];
				
				result[i][result[i].length - 1] += narr[i][j];//마지막 열에 누적, 자동 초기화가된다
				result[result.length - 1][j] += narr[i][j];//마지막 행에 누적, 자동 초기화가된다
				
				result[result.length - 1][result[i].length - 1] += narr[i][j];//마지막 행렬에도 붙여준다
			}
		}
		//2차원 배열은 2중 for 문과 쓸일이 많다
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
