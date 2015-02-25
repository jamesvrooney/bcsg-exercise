package com.rooney.james;

import org.joda.time.DateTime;

/**
 * Created by jamesvrooney on 25/02/15.
 */
public class HSBCCanadaCard extends BankCard {
    private String maskingPattern = "##xx-xxxx-xxxx-xxxx";

    public HSBCCanadaCard (String cardNumber, DateTime expiryDate) {
        super(cardNumber, expiryDate);

        setBankName("HSBC Canada");

        maskedNumber = maskNumber(cardNumber, maskingPattern);
    }

    @Override
    public String toString() {
        return "HSBCCanadaCard::" + super.toString();
    }
}
