/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model;

import java.util.Objects;

/**
 *
 * @author Adam
 */
public class Card {

    public Card(Suit suit, Rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    private Suit suit;
    private Rank rank;

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getSimpleValue() {
        return this.rank.getRankValue();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Card)) {
            return false;
        }

        Card that = (Card) other;

        // Custom equality check here.
        return this.suit.equals(that.suit)
                && this.rank.equals(that.rank);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.suit);
        hash = 29 * hash + Objects.hashCode(this.rank);
        return hash;
    }
}
