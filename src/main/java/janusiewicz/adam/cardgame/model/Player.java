/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class Player {

    public Player(String name) {
        this.name = name;
    }

    private List<Card> hand = new ArrayList();
    private String name;

    /**
     * @return the hand
     */
    public List<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String value = name + " hand size is " + hand.size();
        return value;
    }
}
