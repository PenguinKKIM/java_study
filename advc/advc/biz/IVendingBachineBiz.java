package com.aswr06.advc.biz;

import com.aswr06.advc.entity.Drink;

public interface IVendingBachineBiz {
    abstract void cartDrink(Drink drink);

    abstract void printCart();

    abstract void printDrinkList(Drink[] drings);
}