package com.deepak.gof.singleton.demo1.billpughinitialization;

public class BillPughSingleton {

    private BillPughSingleton () {

    }

    private static class SingletonHelperInner {
        private static final BillPughSingleton BILL_PUGH_SINGLETON = new BillPughSingleton();
    }

    public static BillPughSingleton getSingletonInstance() {
        return SingletonHelperInner.BILL_PUGH_SINGLETON;
    }
}