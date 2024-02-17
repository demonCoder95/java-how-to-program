/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7;

/**
 *
 * @author noorm
 */
public class Card {
    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)
    
    // two-argument constructor initializes card's face value and suit
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
    
    // return String representation of card
    public String toString(){
        return face + " of " + suit;
    }
} // end class Card
