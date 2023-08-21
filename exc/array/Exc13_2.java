package arr_exc;

import java.util.Scanner;

public class Exc13_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int money = 0;
		int orCnt = 0;
		int[] order = new int[10];
		int[] coins = {5000, 1000, 500};
		int[] price = {1500, 2500, 2500, 2000, 3000};
		
		String [] menu = {"아메리카노","카페라떼","카푸치노","에스프레소","카페모카"};
		
		//0이 아닐때는 계속 입력상태
		//0 이면 종료
		while (true) {

			System.out.println("[코스타 카페]");
			
			for(int i =0; i < menu.length; i++) {
				System.out.println(String.format("%d. %s (%d 원) ",i+1,menu[i], price[i]));
			}
			
			System.out.println("0. 계산 ");
			System.out.print(" 선택 > ");
			
			for (int i = 0; i < orCnt; i++) {
				System.out.println(order[i] + ",");
			}

			sel = sc.nextInt();
			if (sel == 0) { 
				int sum = 0;
				
				//1. 주문 내역 보여주기
				System.out.println("주문내역 : ");
				for(int i =0; i < orCnt ; i++) {
					System.out.println(menu[order[i]-1] + " ");
					sum += price[order[i]-1];
				}
				
				//2. 돈 입력받기
				System.out.println(String.format("돈을 넣으세요 : %d 원", sum));
				money = sc.nextInt();

				//3. 돈이부족하면 돈이 부족합니다
				if (money < sum) {
					System.out.println("돈이 모자릅니다");
					continue;
				}

				if (money == sum) {
					System.out.println("거스름돈이 필요없습니다");
					break;
				}
				
				if (money > sum) {
					int change = money - sum;
					for (int i = 0; i < coins.length; i++) {
						int cnt = change/coins[i];
						System.out.println(String.format("%d(%d)", coins[i], cnt));
						change %= coins[i];
					}
					System.out.println();
					break;
				}
			}
			order[orCnt++] = sel;
		}
	}
}
