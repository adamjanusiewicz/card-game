/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model.games.war;

import janusiewicz.adam.cardgame.model.Card;
import janusiewicz.adam.cardgame.model.Game;
import janusiewicz.adam.cardgame.model.Player;
import janusiewicz.adam.cardgame.model.PlayingDeck;
import janusiewicz.adam.cardgame.model.WrongGameRulesException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam
 */
public class WarGame implements Game {

    PlayingDeck playingDeck;
    List<Player> players = new ArrayList();

    @Override
    public void deal() {
        int deckSize = playingDeck.getCardsSize();
        for (int i = 0; i < deckSize; i++) {
            for (Player player : players) {
                Card card = playingDeck.getTopCard();
                if (card != null) {
                    player.addCard(card);
                }
            }
        }

    }

    @Override
    public void addPlayer(Player player) throws WrongGameRulesException {
        if (players.size() >= 2) {
            throw new WrongGameRulesException("The War Game cannot have more than two players!");
        }
        players.add(player);
    }

    @Override
    public void addPlayingDeck(PlayingDeck playingDeck) {
        this.playingDeck = playingDeck;
    }

}
