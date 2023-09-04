package com.aswr06.advc.biz;

import com.aswr06.advc.entity.Coffee;
import com.aswr06.advc.entity.Coke;
import com.aswr06.advc.entity.Drink;
import com.aswr06.advc.entity.Juice;

import java.util.LinkedHashMap;
import java.util.Map;

public class VendingMachineBiz implements IVendingBachineBiz {
    private int balance = 1000;
    private Drink[] cartList = new Drink[3];
    private int count = 0;

    @Override
    public void cartDrink(Drink drink) {
        // 1. 기본 예외 처리
        if (drink == null) return;

        // 2. 잔액이 적을 경우
        int drinkPrice = drink.getPrice();
        if (this.balance < drinkPrice) {
            System.out.println("잔액이 부족하여 " + drink + " 구매 불가능합니다.");
            return;
        }

        // 3. 잔액 차감
        this.balance -= drinkPrice;

        // 4. 배열이 모자랄 경우 증가
        if (this.cartList.length == this.count) {
            Drink[] copyCartList = new Drink[this.count * 3];
            System.arraycopy(this.cartList, 0, copyCartList, 0, this.count);
            this.cartList = copyCartList;
        }

        // 5. 배열에 담기
        this.cartList[this.count++] = drink;
        System.out.print(drink + "를 구입했습니다.");
        System.out.println("현재 잔액: " + this.balance + " 원");
    }

    @Override
    public void printCart() {
        Map<Class<? extends Drink>, Integer> map = new LinkedHashMap<>();
        map.put(Juice.class, 0);
        map.put(Coffee.class, 0);
        map.put(Coke.class, 0);

        int sumPrice = 0;

        // 1. 구입한 음료수가 있을 경우
        if (this.count > 0) {
            for (int i = 0; i < this.count; i++) {
                Drink drink = this.cartList[i];
                // 1-1. 각 음료수 개수 증가
                map.put(drink.getClass(), map.get(drink.getClass()) + 1);
                // 1-2. 금액 합계 증가
                sumPrice += drink.getPrice();
            }
            // 1-3. 각 음료수별 개수 출력
            for (Class<? extends Drink> drink : map.keySet()) {
                int cnt = map.get(drink);
                if (cnt > 0) {
                    try {
                        System.out.println(drink.getMethod("toString").invoke(drink.getDeclaredConstructor().newInstance()) + " : " + cnt + "개");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        // 2. 사용 금액 및 남은 금액 출력
        System.out.println("==========================");
        System.out.println("사용 금액 : " + sumPrice + " 원");
        System.out.println("남은 금액 : " + this.balance + " 원");
    }

    @Override
    public void printDrinkList(Drink[] drinks) {
        System.out.println("음료수명    가격");
        System.out.println("==========================");
        for (Drink drink : drinks) {
            System.out.println(drink + "     " + drink.getPrice() + "원");
        }
        System.out.println("==========================");
        System.out.println("현재 잔액: " + this.balance + " 원");
    }
}
