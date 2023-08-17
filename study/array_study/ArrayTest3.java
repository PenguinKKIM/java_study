package array_study;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[] balls = new int[45]; // int 타입 배열선언
		int[] pickedBalls = new int[6];

		// for/if문만들때 첨에 에러나는것에 당황하지 말기 뒤에 {} 가 없어서 그런것....
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}

		// 0.0 <= Math.random() <= 1
		for (int i = 0; i < 1000; i++) {
			int idx1 = (int) (Math.random() * balls.length);
			int idx2 = (int) (Math.random() * balls.length);

			int temp = balls[idx1]; // 랜덤하게
			balls[idx1] = balls[idx2];
			balls[idx2] = temp;

		}// 랜덤하게 뽑는 수는 이 코드를 많이 씁니다(읽기 쉬워서)
		
		for(int i =0;i< pickedBalls.length; i++) {
			pickedBalls[i]= balls[i];
		}
		
		for (int i = 0; i < pickedBalls.length; i++) {
			System.out.print(balls[i] + " ");
		}
	}
}
