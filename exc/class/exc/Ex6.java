package exc;

public class Ex6 {
	
	
	
	static int[] shuffle(int[] arr) {
//		int [] mixarr = new int[arr.length]; // 새로 생성된 mixarr 을
//		System.arraycopy(arr,0,mixarr,0,arr.length); // arr 을 복사해 담는 그릇이 되게한다
		
		int [] mixarr = arr.clone(); //arr 배열을 mixarr 에 복사한다
		
		for (int i = 0; i < 100; i++) {
			int idx1 = (int) (Math.random() * arr.length);
			int idx2 = (int) (Math.random() * arr.length);

			int temp = mixarr[idx1];
			mixarr[idx1] = mixarr[idx2];
			mixarr[idx2] = temp;
		}
		return mixarr;
	}
	


	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // new 를 써도 같다
		System.out.println(java.util.Arrays.toString(original));
		
		
		System.out.println();
		int[] result = shuffle(original);
		
		System.out.println(java.util.Arrays.toString(original)); //원본이 같이 바뀐다
		System.out.println(java.util.Arrays.toString(result));
		System.out.println(original == result); //true 
	}
}
