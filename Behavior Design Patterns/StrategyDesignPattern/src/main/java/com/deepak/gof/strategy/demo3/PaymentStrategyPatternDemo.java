package com.deepak.gof.strategy.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaymentStrategyPatternDemo {

    private static final Logger logger = LogManager.getLogger(PaymentStrategyPatternDemo.class);
    private BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String... args) throws IOException {
        PaymentStrategyPatternDemo patternDemo = new PaymentStrategyPatternDemo();
        String continueShopping;
        ShoppingCartContext shopingCart = new ShoppingCartContext();
        int payementOption;
        logger.info("**** Shopping Cart ****");
        do {

            logger.info("Add item to the Cart");
            logger.info("Enter the itemId: ");
            int itemId;
            try {
                itemId = Integer.parseInt(patternDemo.bufferReader.readLine());
            } catch (NumberFormatException exception) {
                logger.info("Exception occurred !!!!!!! \n Again enter the ItemId ");
                logger.error(exception);
                itemId = Integer.parseInt(patternDemo.bufferReader.readLine());
            }
            logger.info("Enter the ItemPrice: ");
            float itemPrice = Float.parseFloat(patternDemo.bufferReader.readLine());
            shopingCart.addItem(new ItemBean(itemId, itemPrice));
            logger.info("Press Y to continue Shopping and adding items to the shopping cart");
            continueShopping = patternDemo.bufferReader.readLine();
        } while ("Y".equalsIgnoreCase(continueShopping));

        logger.info("You have added " + shopingCart.getTotalItemAdded() + " items in Your Shopping cart ");
        logger.info("Select A Payement option to Pay " + shopingCart.calTotalAmount());
        logger.info("1. DEBIT CARD \n 2. PAYPAL \n 3. UPI");
        try {
            payementOption = Integer.parseInt(patternDemo.bufferReader.readLine());
        } catch (NumberFormatException exception) {
            logger.info("Exception occurred !!!!!!! \n Again enter the payment option ");
            logger.error(exception);
            payementOption = Integer.parseInt(patternDemo.bufferReader.readLine());
        }

        switch (payementOption) {
        case 1:
            DebitCardPayment debitPayment = new DebitCardPayment();
            logger.info("You have selected DEBIT CARD as payement option \n Enter Following Details:");
            logger.info("Your Name: ");
            debitPayment.setName(patternDemo.bufferReader.readLine());
            logger.info("Debit card no: ");
            debitPayment.setCardNo(Long.parseLong(patternDemo.bufferReader.readLine()));
            logger.info("Expiry Details: ");
            debitPayment.setValidUpto(Integer.parseInt(patternDemo.bufferReader.readLine()));
            logger.info("CVV no: ");
            debitPayment.setCvvNo(Integer.parseInt(patternDemo.bufferReader.readLine()));
            logger.info(shopingCart.paymentMethod(debitPayment));
            break;

        case 2:
            logger.info("You have selected PAYPAL as payement option \n Enter Following Details:");
            PaypalPayment paypalPayment = new PaypalPayment();
            logger.info("Your EmailId: ");
            paypalPayment.setEmailId(patternDemo.bufferReader.readLine());
            logger.info("Your Password: ");
            paypalPayment.setPassword(patternDemo.bufferReader.readLine());
            logger.info(shopingCart.paymentMethod(paypalPayment));
            break;

        case 3:
            logger.info("You have selected PAYPAL as payement option \n Enter Following Details:");
            UpiPayment upiPayment = new UpiPayment();
            logger.info("Your UPIId: ");
            upiPayment.setUpiId(patternDemo.bufferReader.readLine());
            logger.info(shopingCart.paymentMethod(upiPayment));
            break;

        default:
            logger.info("Entered a wrong choice for payment");
        }
    }

}