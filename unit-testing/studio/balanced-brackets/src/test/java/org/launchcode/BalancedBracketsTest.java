package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsWithCharReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[c]"));
    }
    @Test
    public void stringWithLeadingSpacesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("  [boat]"));
    }
    @Test
    public void stringWithTrailingSpacesReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[boat]]    "));
    }
    @Test
    public void stringWithLeadingCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Sail[boat]"));
    }
    @Test
    public void stringWithTrailingCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Sail]boat"));
    }
    @Test
    public void imbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void sequentialBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void tooManyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }
    @Test
    public void nonSequentialBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}