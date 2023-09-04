package com.aswr06.advc;

import com.aswr06.advc.biz.VendingMachineBiz;
import com.aswr06.advc.entity.Coffee;
import com.aswr06.advc.entity.Coke;
import com.aswr06.advc.entity.Drink;
import com.aswr06.advc.entity.Juice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VendingMachineTest {

    public static void main(String[] args) {
        // 1. 판매 음료수 세팅
        Drink[] drinks = new Drink[3];
        drinks[0] = new Juice();
        drinks[1] = new Coffee();
        drinks[2] = new Coke();

        // 2. 판매 준비
        VendingMachineBiz vm = new VendingMachineBiz();
        Scanner sc = new Scanner(System.in);
        String errMsg = "메뉴값을 확인후 다시 입력하세요.";

        // 3. 판매 반복
        boolean isLoop = true;
        while (isLoop) {
            // 3-1. 메뉴 출력
            printMenu();
            // 3-2. 메뉴 입력
            System.out.print("메뉴 입력 => ");
            String input = sc.nextLine();
            // 3-3. 입력 예외 처리
            if (input == null || input.length() != 1 || !"123459".contains(input)) {
                System.out.println(errMsg);
                continue;
            }
            // 3-4. 숫자 변환 및 메뉴 검색
            int sel = Integer.parseInt(input);
            switch (sel) {
                // 3-5. 음료수 메뉴 및 잔액 출력
                case 1:
                    vm.printDrinkList(drinks);
                    break;
                // 3-6. 음료수 구입
                case 2:
                case 3:
                case 4:
                    vm.cartDrink(drinks[sel - 2]);
                    break;
                // 3-7. 구입한 음료수 출력
                case 5:
                    vm.printCart();
                    break;
                // 3-8. 종료
                case 9:
                    isLoop = false;
                    break;
                default:
                    System.out.println(errMsg);
            }
        }

        // 4. 판매 종료
        sc.close();
        System.out.println("프로그램 종료");
    }

    private static void printMenu() {
        System.out.println("==========================");
        System.out.println("[음료수 자판기 관리 시스템] ");
        System.out.println("==========================");
        System.out.println("1.전체 음료수 및 잔액 보기");
        System.out.println("2.쥬스 구입하기 ( 200원 )");
        System.out.println("3.커피 구입하기 ( 100원 )");
        System.out.println("4.코크 구입하기 ( 50원 )");
        System.out.println("5.구입한 음료수 목록 보기");
        System.out.println("9.종료");
        System.out.println("==========================");
    }
}
