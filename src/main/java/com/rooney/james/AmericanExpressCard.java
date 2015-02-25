package com.rooney.james;

import org.joda.time.DateTime;

/**
 * Created by jamesvrooney on 25/02/15.
 */
public class AmericanExpressCard extends BankCard {
    private String maskingPattern = "xxxx-xxxx-xxxx-###";


    public AmericanExpressCard(String cardNumber, DateTime expiryDate) {
        super(cardNumber, expiryDate);

        setBankName("American Express");

        maskedNumber = maskNumber(cardNumber, maskingPattern);
    }

    @Override
    public String toString() {
        return "AmericanExpressCard::" + super.toString();
    }
}
