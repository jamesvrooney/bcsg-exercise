package com.rooney.james;

import org.joda.time.DateTime;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by jamesvrooney on 25/02/15.
 */
public class PopulateBankCardsList {
    final DateTime NOV_2017 = new DateTime(2017, 11, 1, 0, 0);
    final DateTime OCT_2017 = new DateTime(2017, 10, 1, 0, 0);
    final DateTime DEC_2018 = new DateTime(2018, 12, 1, 0, 0);

    HSBCCanadaCard hsbcCanadaBankCard = new HSBCCanadaCard("5601-2345-3446-5678", NOV_2017);
    RoyalBankCanadaCard royalBankCanadaBankCard = new RoyalBankCanadaCard("4519-4532-4524-2456", OCT_2017);
    AmericanExpressCard americanExpressBankCard = new AmericanExpressCard("3786-7334-8965-345", DEC_2018);

    List<BankCard> bankCards = Arrays.asList(hsbcCanadaBankCard, royalBankCanadaBankCard, americanExpressBankCard);

    List<BankCard> orderByDateDescending(List<BankCard> unorderedList) {
        return unorderedList.stream().sorted(comparing(BankCard::getExpiryDate).reversed()).collect(toList());
    }

    public List<BankCard> getBankCards() {
        return bankCards;
    }
}

