package com.deepak.gof.strategy.demo3;

public class DebitCardPayment implements IPaymentStrategy {

    private String name;
    private long cardNo;
    private int validUpto;
    private int cvvNo;

    @Override
    public String pay(float totalAmount) {
        return totalAmount + " paid using DEBIT CARD";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardNo() {
        return cardNo;
    }

    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    public int getValidUpto() {
        return validUpto;
    }

    public void setValidUpto(int validUpto) {
        this.validUpto = validUpto;
    }

    public int getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(int cvvNo) {
        this.cvvNo = cvvNo;
    }

}