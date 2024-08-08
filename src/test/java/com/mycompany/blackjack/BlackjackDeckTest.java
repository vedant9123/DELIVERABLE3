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

public class BlackjackDeckTest {
    
private Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new BlackjackDeck();
    }

    @Test
    public void testDeckInitialization() {
        assertEquals(52, deck.remainingCards(), "Deck should have 52 cards after initialization.");
    }

    @Test
    public void testDealCard() {
        Card card = deck.dealCard();
        assertNotNull(card, "Dealt card should not be null.");
        assertEquals(51, deck.remainingCards(), "Deck should have 51 cards after dealing one card.");
    }

    @Test
    public void testShuffle() {
        deck.shuffle();
        // Additional logic can be added here to test shuffle randomness if needed
    }

    @Test
    public void testDealCardFromEmptyDeck() {
        for (int i = 0; i < 52; i++) {
            deck.dealCard();
        }
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            deck.dealCard();
        });
        assertEquals("No cards left in the deck.", exception.getMessage());
    }
}
