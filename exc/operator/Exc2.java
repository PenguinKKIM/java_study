package exc;

public class Exc2 {

	public static void main(String[] args) {
		// 1부터 20까지 정수중에서 2또는 3의배수가 아닌수의 총합을 구하세요
		int sum = 0;
		for (int i = 1; i <= 20; i++) { // i%2!=0 && i%3!=0 과 같다
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			sum += i;
		}
		System.out.println(sum);
	}
}