package arr_exc;

public class Exc7 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);
		System.out.println("money=" + money);
		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;//필요한 동전의 갯수
//			 1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
			coinNum = money/coinUnit[i];
//			 2. 배열 coin에서 coinNum만큼의 동전을 뺀다. (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.) 
			if(coinNum<=coin[i]) { // 필요한동전 갯수가 남아있는 동전 갯수보다 많으면
				coin[i] -= coinNum; //남아있는 동전의 배열에서 필요한 동전 갯수를 뺀다.
			} else { //필요한 동전의 갯수가 남아있는 동전의 갯수보다 적으면
				coinNum = coin[i]; // 남아있는 동전의 갯수를 필요한 동전의 갯수로 넣고
				coin[i] = 0; //남아있는 동전의 갯수를 0으로 만든다.
			}
//			 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			 money = money -(coinNum*coinUnit[i]);
			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		System.out.println("=남은 동전의 개수 =");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
		}
	}
}
