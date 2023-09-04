package com.aswr06.base.biz;

import com.aswr06.base.entity.Coffee;
import com.aswr06.base.entity.Coke;
import com.aswr06.base.entity.Drink;
import com.aswr06.base.entity.Juice;

public class VendinMachineBiz implements IVendingBachineBiz {
    int balance = 1000;
    Drink[] cartList = new Drink[3];
    int count = 0;

    @Override
    public void cartDrink(Drink drink) {

        if (balance < drink.getPrice()) {
            System.out.println("잔액이 부족하여 " + drink + " 구매 불가능합니다.");
        } else {
            balance -= drink.getPrice();
            if (count == cartList.length) {
                Drink[] cart2 = new Drink[cartList.length * 3];
                System.arraycopy(cartList, 0, cart2, 0, cartList.length);
                cartList = cart2;
            }
            cartList[count++] = drink;
            System.out.print(drink + "를 구입했습니다.");
            System.out.println("현재 잔액: " + balance + " 원");
        }
    }

    @Override
    public void printCart() {
        int coffeeCnt = 0;
        int juiceCnt = 0;
        int cokeCnt = 0;
        int totP = 0;
        for (int i = 0; i < count; i++) {
            if (cartList[i] instanceof Coffee) coffeeCnt++;
            else if (cartList[i] instanceof Juice) juiceCnt++;
            else if (cartList[i] instanceof Coke) cokeCnt++;
            totP += cartList[i].getPrice();
        }
        if (coffeeCnt > 0) {
            System.out.println("커피 : " + coffeeCnt + "개");
        }
        if (juiceCnt > 0) {
            System.out.println("쥬스 : " + juiceCnt + "개");
        }
        if (cokeCnt > 0) {
            System.out.println("코크 : " + cokeCnt + "개");
        }
        System.out.println("====================");
        System.out.println("사용 금액 : " + totP + " 원");
        System.out.println("남은 금액 : " + balance + " 원");
    }

    @Override
    public void printDrinkList(Drink[] drinks) {
        System.out.println("음료수명    가격");
        System.out.println("============");
        for (Drink drink : drinks) {
            System.out.println(drink.toString() + "     " + drink.getPrice() + "원");
        }
        System.out.println("============");
        System.out.println("현재 잔액: " + balance + "원");
    }
}
