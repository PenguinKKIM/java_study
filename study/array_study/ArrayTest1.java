package array_study;

public class ArrayTest1 {
	public static void main(String[] args) {
		int arr[]; // 레퍼런스만 잡은것 , 주소가 들어간다

		int[] narr1 = new int[5]; // int 타입 저장공간 4byte.배열의 각 요소는는 0으로 초기화된다
		double[] darr1 = new double[5]; // double 타입 주소는 같으나 , 저장 공간이 다르다 8byte

		int[] narr2; // 선언하고
		narr2 = new int[10]; // 배열수 초기화

//		narr1[0] =1;
//		narr1[1] =2;
//		narr1[2] =3;
//		narr1[3] =4;
//		narr1[4] =5;

		// narr1[6] =2; Index 5 out of bounds for length :선언한 배열보다 더큰 수를 불러서 컴파일 에러

		int[] narr3 = new int[] { 1, 2, 3, 4 };

		System.out.println(narr3[1]);

		for (int j = 0; j < narr3.length; j++) {
			System.out.println(narr3[j]);
		}

		int sum = 0;
		for (int i = 0; i < narr1.length; i++) {
			sum += narr1[i];
		}
		System.out.println(sum);
	}
}
