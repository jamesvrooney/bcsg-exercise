package com.rooney.james;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PopulateBankCardsListTest {

    final DateTime NOV_2017 = new DateTime(2017, 11, 1, 0, 0);
    final DateTime OCT_2017 = new DateTime(2017, 10, 1, 0, 0);
    final DateTime DEC_2018 = new DateTime(2018, 12, 1, 0, 0);
    PopulateBankCardsList populateBankCardsList = new PopulateBankCardsList();

    @Test
    public void testOrderByDateDescending() throws Exception {
        List<BankCard> bankCardsUnordered = populateBankCardsList.getBankCards();

        assertEquals(NOV_2017, bankCardsUnordered.get(0).getExpiryDate());
        assertEquals(OCT_2017, bankCardsUnordered.get(1).getExpiryDate());
        assertEquals(DEC_2018, bankCardsUnordered.get(2).getExpiryDate());

        List<BankCard> bankCardsOrdered = populateBankCardsList.orderByDateDescending(bankCardsUnordered);

        assertEquals(DEC_2018, bankCardsOrdered.get(0).getExpiryDate());
        assertEquals(NOV_2017, bankCardsOrdered.get(1).getExpiryDate());
        assertEquals(OCT_2017, bankCardsOrdered.get(2).getExpiryDate());
    }
}