/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model.games.war;

import janusiewicz.adam.cardgame.model.Card;
import janusiewicz.adam.cardgame.model.Hand;
import janusiewicz.adam.cardgame.model.WrongGameRulesException;
import java.util.List;

/**
 *
 * @author Adam
 */
public class WarHand implements Hand {

    @Override
    public int evaluate(List<Card> hand1, List<Card> hand2) throws WrongGameRulesException {
        if (hand1 == null || hand2 == null || hand1.size() != 1 || hand2.size() != 1) {
            throw new WrongGameRulesException("For The War Game you can evaluate only one card each hand");
        }
        return new Integer(hand1.get(0).getSimpleValue()).compareTo(hand2.get(0).getSimpleValue());
    }

}
