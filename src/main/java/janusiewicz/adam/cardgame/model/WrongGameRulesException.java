/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janusiewicz.adam.cardgame.model;

/**
 *
 * @author Adam
 */
public class WrongGameRulesException extends Exception {

    public WrongGameRulesException(String message) {
        super(message);
    }
}
