package com.Carddeck.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        }
        return null;
    }

    public List<Card> drawRandomCards(int numberOfCards) {
        List<Card> drawnCards = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            if (cards.isEmpty()) break;
            drawnCards.add(cards.remove(random.nextInt(cards.size())));
        }
        return drawnCards;
    }
}

