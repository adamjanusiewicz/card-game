/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame;

import janusiewicz.adam.cardgame.model.Deck;
import janusiewicz.adam.cardgame.model.Player;
import janusiewicz.adam.cardgame.model.PlayingDeck;
import janusiewicz.adam.cardgame.model.WrongGameRulesException;
import janusiewicz.adam.cardgame.model.games.war.WarGame;

/**
 *
 * @author Adam
 */
public class Start {

    public static void main(String[] args) throws WrongGameRulesException {

        WarGame warGame = new WarGame();
        PlayingDeck playingDeck = new PlayingDeck();
        playingDeck.addDeck(new Deck());
        warGame.addPlayingDeck(playingDeck);

        Player adam = new Player("Adam");
        warGame.addPlayer(adam);
        Player marek = new Player("Marek");
        warGame.addPlayer(marek);

        warGame.deal();

        System.out.println(adam.toString());
        System.out.println(marek.toString());
    }
}
