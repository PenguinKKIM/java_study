package arr_study2;

public class ArrayTest3 {

	public static void main(String[] args) {
		int [][] narr2 = new int[][] { //new int[][] 생략가능 보기가 더 쉽다
										{1,2,3,4},
										{5,6,7,8},
										{9,10,11,12}
									};
									
		//위에 코드와 형식은 같다. 위의 것을 기본으로쓴다
		int [][] narr3 = new int[3][]; //int[행][열] 
		narr3[0] = new int [] {1,2,3,4};
		narr3[1] = new int [] {5,6,7,8};
		narr3[2] = new int [] {9,10,11,12};
		
		
		
		// 각 행의 열의 갯수가 다른 배열 : 가변배열
		int [][] narr4 = new int[3][];
		narr4[0] = new int [] {1,2,3,4};
		narr4[1] = new int [] {5,6,};
		narr4[2] = new int [] {90,10,11,12};
		
	}

}
