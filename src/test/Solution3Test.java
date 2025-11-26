package test;

import main.Solution_3.Solution3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    Solution3 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution3();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(6, solution.lengthOfLongestSubstring("asjrgapa"));
        assertEquals(3, solution.lengthOfLongestSubstring("123123"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(6, solution.lengthOfLongestSubstring("abcdefabcbb"));
        assertEquals(5, solution.lengthOfLongestSubstring("tmmzuxt"));
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
        assertEquals(1, solution.lengthOfLongestSubstring("      "));

        assertEquals(7, solution.lengthOfLongestSubstring("zxcvbnmmnbvcxz"));
        assertEquals(36, solution.lengthOfLongestSubstring("1234567890qwertyuiopasdfghjklzxcvbnm"));
        assertEquals(72, solution.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()"));
        assertEquals(11, solution.lengthOfLongestSubstring("$$$#@%^&*()_+$@!$#@"));


    }
}