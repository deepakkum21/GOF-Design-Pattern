package com.deepak.gof.strategy.demo3;
 
public class UpiPayment implements IPaymentStrategy {

    private String upiId;

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public String pay(float totalAmount) {
        return totalAmount + " paid using UPI";
    }

}