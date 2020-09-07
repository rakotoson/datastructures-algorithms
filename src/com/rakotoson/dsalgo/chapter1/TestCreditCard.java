package com.rakotoson.dsalgo.chapter1;

import com.rakotoson.dsalgo.chapter1.models.CreditCard;

public class TestCreditCard {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];

        wallet[0] = new CreditCard("Avotra Rakotoson", "BOA", "5555-5555-5555-5555", 5000);
        wallet[1] = new CreditCard("Niaina Avotra", "BNI", "3333-3333-5555-5555", 10000);
        wallet[2] = new CreditCard("Niaina", "BMOI", "4444-4444-4444-4444", 20000);

        for (int i = 0; i < 16; i++) {
            wallet[0].charge(3*i);
            wallet[1].charge(2*i);
            wallet[2].charge(i);
        }

        for (CreditCard card: wallet) {
            CreditCard.printSummary(card);
            while (card.getBalance()>200.0) {
                card.makePayment(200);
                System.out.println("New balance: " + card.getBalance());
            }
        }
    }
}
