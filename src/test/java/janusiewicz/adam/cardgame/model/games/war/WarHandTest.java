/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model.games.war;

import janusiewicz.adam.cardgame.model.Card;
import janusiewicz.adam.cardgame.model.Rank;
import janusiewicz.adam.cardgame.model.Suit;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam
 */
public class WarHandTest {

    @Test
    public void testEvaluate() throws Exception {
        System.out.println("evaluate");
        List<Card> hand1 = new ArrayList();
        hand1.add(new Card(Suit.CLUBS, Rank.ACE));
        List<Card> hand2 = new ArrayList();
        hand2.add(new Card(Suit.CLUBS, Rank.ACE));
        WarHand instance = new WarHand();
        assertEquals(0, instance.evaluate(hand1, hand2));

        hand1 = new ArrayList();
        hand1.add(new Card(Suit.CLUBS, Rank.KING));
        hand2 = new ArrayList();
        hand2.add(new Card(Suit.CLUBS, Rank.NINE));
        assertEquals(1, instance.evaluate(hand1, hand2));

        hand1 = new ArrayList();
        hand1.add(new Card(Suit.CLUBS, Rank.FIVE));
        hand2 = new ArrayList();
        hand2.add(new Card(Suit.CLUBS, Rank.ACE));
        assertEquals(-1, instance.evaluate(hand1, hand2));

    }

}
