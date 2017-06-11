package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 6/10/17.
 */
public class BasketTest {
    Basket basket = new Basket();
    Item item = new Item();

    @Test
    public void doesBasketClassExist() {
        assertNotNull(basket);
    }

    @Test
    public void doesBasketStart_at0() {
        assertEquals(0, basket.countItem());
    }

    @Test
    public void canAddItem() {
        basket.addItem(item);
        assertEquals(1, basket.countItem());
    }

    @Test
    public void canRemoveItem() {
        basket.addItem(item);
        basket.removeItem(item);
        assertEquals(0, basket.countItem());

    }

    @Test
    public void canEmptyBasket() {
        Item item1 = new Item();
        basket.addItem(item);
        basket.addItem(item1);
        basket.empty();
        assertEquals(0, basket.countItem());
    }

    @Test
    public void doesBalanceStartAt0() {
        assertEquals(0, basket.getBalance());
    }

    @Test
    public void doesBalanceIncreaseWhenItemIsAdded() {
        Item item1 = new Item();
        basket.addItem(item1);
        assertEquals(5, basket.getBalance());
    }

    @Test
    public void doesBalanceIncreaseWhen2ItemAreAdded() {
        Item item1 = new Item();
        basket.addItem(item1);
        basket.addItem(item);
        assertEquals(10, basket.getBalance());
    }
 }