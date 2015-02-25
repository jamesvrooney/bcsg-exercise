package com.rooney.james;

import org.joda.time.DateTime;

/**
 * Created by jamesvrooney on 25/02/15.
 */
public class RoyalBankCanadaCard extends BankCard {
    private String maskingPattern = "####-xxxx-xxxx-xxxx";

    public RoyalBankCanadaCard(String cardNumber, DateTime expiryDate) {
        super(cardNumber, expiryDate);

        setBankName("Royal Bank Canada");

        maskedNumber = maskNumber(cardNumber, maskingPattern);
    }

    @Override
    public String toString() {
        return "RoyalBankCanadaCard::" + super.toString();
    }
}
