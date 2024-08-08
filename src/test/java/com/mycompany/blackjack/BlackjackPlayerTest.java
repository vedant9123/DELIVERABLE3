/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author kiswo
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlackjackPlayerTest {
    /*public class BlackjackPlayerTest {*/
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new BlackjackPlayer("TestPlayer");
    }

    @Test
    public void testAddCard() {
        Card card = new BlackjackCard("Hearts", "5", 5);
        player.addCard(card);
        assertEquals(1, player.getHand().size(), "Player should have 1 card in hand.");
    }

    @Test
    public void testGetHandValue() {
        player.addCard(new BlackjackCard("Hearts", "5", 5));
        player.addCard(new BlackjackCard("Diamonds", "10", 10));
        assertEquals(15, player.getHandValue(), "Hand value should be 15.");
    }

    @Test
    public void testIsBust() {
        player.addCard(new BlackjackCard("Hearts", "10", 10));
        player.addCard(new BlackjackCard("Diamonds", "10", 10));
        player.addCard(new BlackjackCard("Clubs", "2", 2));
        assertTrue(player.isBust(), "Player should be bust.");
    }

    @Test
    public void testClearHand() {
        player.addCard(new BlackjackCard("Hearts", "5", 5));
        player.clearHand();
        assertEquals(0, player.getHand().size(), "Player's hand should be cleared.");
    }
}

