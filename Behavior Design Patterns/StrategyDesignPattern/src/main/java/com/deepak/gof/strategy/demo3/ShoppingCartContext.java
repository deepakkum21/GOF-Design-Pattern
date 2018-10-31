package com.deepak.gof.strategy.demo3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartContext {
    private List<ItemBean> itemList;

    ShoppingCartContext() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(ItemBean newItem) {
        this.itemList.add(newItem);
    }

    public void removeItem(ItemBean deleteItem) {
        this.itemList.remove(deleteItem);
    }

    public float calTotalAmount() {
        float totalAmount = 0.0f;
        for (ItemBean item: this.itemList) {
            totalAmount += item.getItemPrice();
        }
        return totalAmount;
    }

    public String paymentMethod (IPaymentStrategy pStrategy) {
        return pStrategy.pay(calTotalAmount());
    }

    public int getTotalItemAdded() {
        return this.itemList.size();
    }
}