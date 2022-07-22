/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model;

import java.util.List;

/**
 *
 * @author Adam
 */
public interface Hand {

    /**
     *
     * @param hand1
     * @param hand2
     * @return 0 if hand1==hand2, -1 if hand1 is weaker than hand2, 1 if hand1
     * is stronger than hand2
     * @throws janusiewicz.adam.cardgame.model.WrongGameRulesException
     */
    public int evaluate(List<Card> hand1, List<Card> hand2) throws WrongGameRulesException;
}
