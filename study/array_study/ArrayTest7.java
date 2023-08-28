package arr_study2;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[] narr1= {1, 2, 3,4};
		int[] narr2= new int[4]; //새로선언해도 마찬가지이다
		
		System.arraycopy(narr1, 0, narr2, 0, narr1.length); //array 의 수를 복사해준다(deep copy)
		
//		narr2= narr1;//얕은복사 shallow copy
//		값을 복사하는게 아니고 주소를 복사하기 때문에 (레퍼런스변수) 값이 변할시 둘다변한다. 주소끼리의 복사
		
		narr2[0] = 100; 
		
		for(int i = 0; i <narr1.length; i++) {
			System.out.print(narr1[i] + ", ");
		}
		
		System.out.println();
		for(int i = 0; i <narr2.length; i++) {
			System.out.print(narr2[i] + ", ");
		}

	}

}
