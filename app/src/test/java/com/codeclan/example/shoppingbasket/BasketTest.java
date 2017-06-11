package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 6/10/17.
 */
public class BasketTest {
    Basket basket = new Basket();

    @Test
    public void doesBasketClassExist() {
        assertNotNull(basket);
    }

    @Test
    public void doesBasketStart_at0() {
        assertEquals(0, basket.countItem());
    }

    

}