package com.deepak.gof.strategy.demo3;

public class ItemBean {
    private int itemId;
    private float itemPrice;

    ItemBean(int itemId, float itemPrice) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

}