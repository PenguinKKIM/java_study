package exc;

public class Exc3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				//sum += j;
				System.out.print("*");
			}
			System.out.println();
		}
//		System.out.println(sum);
	}

}
