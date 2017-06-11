package com.codeclan.example.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 6/10/17.
 */
public class ItemTest {
    Item item = new Item();

    @Test
    public void doesItemClassExist() {
        assertNotNull(item);
    }

    @Test
    public void doesItemHavePrice() {
        assertEquals(5, item.getPrice());
    }




}