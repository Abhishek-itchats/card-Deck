package com.Carddeck.java;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        // Draw 20 random cards from the deck
        List<Card> drawnCards = deck.drawRandomCards(10);

        System.out.println("Drawn Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }

        // Sort the drawn cards using the custom comparator
        Collections.sort(drawnCards, new CardComparator());

        System.out.println("\nSorted Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }
    }
}

