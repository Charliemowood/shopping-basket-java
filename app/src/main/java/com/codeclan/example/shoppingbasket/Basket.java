package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by home on 6/10/17.
 */

public class Basket {
    private ArrayList<Item> inBasket;
    private int balance = 0;

    public Basket() {
        this.inBasket = new ArrayList<Item>();
        this.balance = balance;
    }

    public int countItem() {
       return this.inBasket.size();
    }

    public void addItem(Item item) {
        inBasket.add(item);
        this.balance += item.getPrice();
    }

    public void removeItem(Item item) {

        this.inBasket.remove(item);

    }

    public void empty() {
        this.inBasket.clear();
    }

    public int getBalance() {
        return this.balance;
    }



}

