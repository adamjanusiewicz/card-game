/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Adam
 */
public class PlayingDeck {

    private List<Card> cards = new ArrayList();

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void addDeck(Deck deck) {
        cards.addAll(deck.getCards());
        shuffle();
    }

    public int getCardsSize() {
        return cards.size();
    }

    public Card getTopCard() {
        if (cards.size() > 0) {
            Card card = cards.get(cards.size() - 1);
            cards.remove(card);
            return card;
        }
        return null;
    }

    public String toString() {
        String value = "deck size is " + getCardsSize() + " ";
        return value;
    }

}
