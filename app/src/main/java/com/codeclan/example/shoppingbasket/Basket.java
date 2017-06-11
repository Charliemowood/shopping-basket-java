package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by home on 6/10/17.
 */

public class Basket {
    private ArrayList<Item> inBasket;

    public Basket() {
        this.inBasket = new ArrayList<Item>();
    }

    public int countItem() {
       return this.inBasket.size();
    }

    public void addItem(Item item) {
        inBasket.add(item);
    }
}