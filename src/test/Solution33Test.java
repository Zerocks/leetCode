package test;

import main.Solution_3.Solution3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

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
        assertEquals(3, solution.lengthOfLongestSubstring("123123"));
    }
}