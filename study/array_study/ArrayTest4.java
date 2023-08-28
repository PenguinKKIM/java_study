package arr_study2;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[][] narr = {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120},
		};
		
		int sum=0;
		//for 문으로 반복시켜서 구해준다
		for (int i = 0; i < narr.length; i++) { // 행의갯수
			for (int j = 0; j < narr[i].length; j++) { // 열의갯수
				sum += narr[i][j];
			}
			
		} // for 끝
		System.out.println(sum);
	}

}
