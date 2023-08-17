package array_study;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] narr1 = new int[] { 1, 2, 3, 4, 5 }; // 배열 초기화 입력한 데이터 갯수를 보고 알아서 데이터를 잡는다
		int[] narr2 = { 1, 2, 3, 4, 5 }; // new int[] 생략 배열 초기화
		int[] narr3;
		narr3 = new int[] { 1, 2, 3, 4, 5 }; // 변수 선언과 초기화를 따로 할때는 new (타입)[] 을 생략할수없다
		
		int n = narr1[2]; //n 에는 3이 들어온다
		
		for(int i =0; i<narr1.length; i++) { //(배열이름).length
			System.out.println(narr1[i]);
		}
	}

}