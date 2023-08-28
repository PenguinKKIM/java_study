package arr_exc;

public class Exc02 {
	public static void main(String[] args) {
		int[][] arr = { // [][] 가 두번 붙으면 2차원 배열 이라는 뜻이다
				{ 5, 5, 5, 5, 5 },
				{ 10, 10, 10 }, 
				{ 20, 20, 20, 20 }, 
				{ 30, 30 } };
		System.out.println(arr[3].length);
	}

//2가 나오는 이유 : 이중 배열 arr 에  컴퓨터언어로 03번째 배열(사람말로는 4번째)은 { 30, 30} 이다. (숫자는 0부터센다)
//여기의 length는 2 이기때문에 2가 출력
}
