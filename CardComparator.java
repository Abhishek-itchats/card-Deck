package com.Carddeck.java;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        // Compare by color
        int colorComparison = getColorValue(c1.getSuit()) - getColorValue(c2.getSuit());
        if (colorComparison != 0) {
            return colorComparison;
        }

        // Compare by suit within color
        int suitComparison = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (suitComparison != 0) {
            return suitComparison;
        }

        // Compare by rank value
        return c1.getRank().ordinal() - c2.getRank().ordinal();
    }

    private int getColorValue(Suit suit) {
        switch (suit) {
            case HEARTS:
            case DIAMONDS:
                return 1; // Red
            case SPADES:
            case CLUBS:
                return 0; // Black
            default:
                throw new IllegalArgumentException("Unknown suit: " + suit);
        }
    }
}

