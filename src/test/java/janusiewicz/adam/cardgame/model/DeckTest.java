/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam
 */
public class DeckTest {

    public DeckTest() {
    }

    /**
     * Test of getCards method, of class Deck.
     */
    @Test
    public void testGetCardsIf52CardsInDeck() {
        System.out.println("testGetCardsIf52CardsInDeck");
        Deck instance = new Deck();
        List<Card> result = instance.getCards();
        assertEquals(result.size(), 52);
    }

}
