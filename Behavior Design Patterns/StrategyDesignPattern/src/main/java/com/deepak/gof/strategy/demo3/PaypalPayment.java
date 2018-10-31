package com.deepak.gof.strategy.demo3;

public class PaypalPayment implements IPaymentStrategy {

    private String emailId;
    private String password;

    @Override
    public String pay(float totalAmount) {
        return totalAmount + " paid using PAYPAL";
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}