package arr_exc;

import java.util.Scanner;

public class Exc13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int money = 0;
		
		int[] coins = {5000, 1000, 500};
		int[] price = {1500, 2500, 2500, 2000, 3000};
		
		
		//0이 아닐때는 계속 입력상태
		//0 이면 종료
		while (true) {

			System.out.println("[코스타 카페]");
			System.out.println("1. 아메리카노 (1500원)");
			System.out.println("2. 카페라떼 (2500원)");
			System.out.println("3. 카푸치노 (2500원)");
			System.out.println("4. 에스프레소 (2000원)");
			System.out.println("5. 카페모카 (3000원)");
			System.out.println("0. 종료 ");
			System.out.print(" 선택 > ");
			sel = sc.nextInt();
			
			if (sel == 0) { // 0이면 종료선택 > 반복문 종료
				System.out.println("종료합니다");
				break;
			}
			
			System.out.println(String.format(" 돈을 넣으세요 : %d 원", price[sel-1] ));
			money = sc.nextInt();
			
			
			if(money < price[sel-1]) {
				System.out.println("돈이 모자릅니다");
				continue;
			}
			
			int change = money - price[sel - 1];
			System.out.println("잔돈 : ");
			for(int i = 0; i < coins.length; i++) {
				int cnt = change/coins[i];
				
				if(cnt > 0) {
					System.out.println(String.format("%d(%d)", coins[i],cnt));
				}
				change%=coins[i];
			}
			
			System.out.println();			
		
		}

	}

}

//1.입금이 가격보다 적을경우 : 돈이 부족합니다
//2. 잔돈 : 500(1), 100(0) 50(0) 10(0)