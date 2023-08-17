package arr_study2;

public class ArrayTest8 {

	public static void main(String[] args) {
		int[] sarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] darr = new int[4];
		System.arraycopy(sarr, 3, darr, 0,4); // 다는 아니고 부분만도 복제할수있다

		for (int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < darr.length; i++) {
			System.out.print(darr[i] + "  ");
		}

	}

}
