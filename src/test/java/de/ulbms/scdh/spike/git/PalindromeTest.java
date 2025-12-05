package de.ulbms.scdh.spike.git;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PalindromeTest {
    @Test
    void testIsPalindrome(){
        assertTrue(Palindrome.isPalindrome("uhu"));
    }

    @Test
    void testMixedCases(){
       assertEquals("uhu", Palindrome.lowerCase("Uhu"));
    }

    @Test
    void testSpaces(){
        assertEquals("uhuuhu", Palindrome.removeSpaces("uhu uhu"));
    }

}