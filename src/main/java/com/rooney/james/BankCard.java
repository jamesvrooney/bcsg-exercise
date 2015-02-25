package com.rooney.james;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by jamesvrooney on 24/02/15.
 */
public abstract class BankCard {
    private String bankName;
    private String cardNumber;
    private DateTime expiryDate;
    private static DateTimeFormatter dtFormatter = DateTimeFormat.forPattern("dd/MM/yyyy");
    protected String maskedNumber;

    /**
     *
     * @param numberToMask
     * @param maskPattern
     * @return maskedNumber
     */
    public String maskNumber(String numberToMask, String maskPattern) {

        StringBuilder maskedNumber = new StringBuilder();

        for (int x = 0; x < maskPattern.length(); x++) {
            maskedNumber.append(maskPattern.charAt(x) == '#' ? numberToMask.charAt(x) : maskPattern.charAt(x));
        }

        return maskedNumber.toString();
    }

    public BankCard(String cardNumber, DateTime expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public DateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(DateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getMaskedAccountNumber() {
        return maskedNumber;
    }

    public String toString() {
        return "{" +
                "expiryDate = " + this.getExpiryDate().toString("MM/yyyy") + '\'' +
                "bankName = " + this.getBankName() + '\'' +
                "cardNumber = " + this.getCardNumber() + '\'' +
                "maskedCardNumber = " + maskedNumber + '\'' +
                '}';
    }
}
