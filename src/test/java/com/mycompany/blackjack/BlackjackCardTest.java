/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author kiswo
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BlackjackCardTest {
        @Test
    public void testCardCreation() {
        Card card = new BlackjackCard("Hearts", "5", 5);
        assertEquals("Hearts", card.getSuit());
        assertEquals("5", card.getRank());
        assertEquals(5, card.getValue());
    }

    @Test
    public void testCardToString() {
        Card card = new BlackjackCard("Hearts", "5", 5);
        assertEquals("5 of Hearts", card.toString());
    }

}
