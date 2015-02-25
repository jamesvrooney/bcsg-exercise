package com.rooney.james;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by jamesvrooney on 25/02/15.
 */
public class BankCardTest {

    private BankCard bankCard;
    private final String HSBC_CANADA_MASKING_PATTERN = "##xx-xxxx-xxxx-xxxx";
    private final String AMERICAN_EXPRESS_MASKING_PATTERN = "xxxx-xxxx-xxxx-###";
    private final String ROYAL_BANK_CANADA_MASKING_PATTERN = "####-xxxx-xxxx-xxxx";

    @Before
    public void setUp() {
        bankCard = Mockito.mock(BankCard.class, Mockito.CALLS_REAL_METHODS);
    }

    @Test
    public void testMaskNumber() {

            // Test American Express Card Masking
            String actualAmericanExpressMaskedCardNumber = bankCard.maskNumber("3786-7334-8965-345", AMERICAN_EXPRESS_MASKING_PATTERN);

            assertEquals("xxxx-xxxx-xxxx-345", actualAmericanExpressMaskedCardNumber);

            // Test HSBC Canada Card Masking
            String actualHSBCMaskedCardNumber = bankCard.maskNumber("5601-2345-3446-5678", HSBC_CANADA_MASKING_PATTERN);

            assertEquals("56xx-xxxx-xxxx-xxxx", actualHSBCMaskedCardNumber);

            // Test Royal Bank Canada Card Masking
            String actualRoyalBankCanadaMaskedCardNumber = bankCard.maskNumber("4519-4532-4524-2456", ROYAL_BANK_CANADA_MASKING_PATTERN);

            assertEquals("4519-xxxx-xxxx-xxxx", actualRoyalBankCanadaMaskedCardNumber);
    }
}