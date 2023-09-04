package com.aswr06.base.biz;

import com.aswr06.base.entity.Drink;

public interface IVendingBachineBiz {
    abstract void cartDrink(Drink drink);

    abstract void printCart();

    abstract void printDrinkList(Drink[] drings);
}