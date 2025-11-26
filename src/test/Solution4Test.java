package test;

import main.Solution_4.Solution4;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Test {

    Solution4 solution;
    @BeforeEach
    void setUp() {
        solution = new Solution4();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(2, solution.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{3,2}, new int[]{1,4}));
        assertEquals(2.5, solution.findMedianSortedArrays(
                new int[]{ 6, 24, 40, 42, 43, 54, 56, 67, 73, 95, 102, 113, 116, 128, 132, 150, 176, 179, 184, 201, 208, 211, 227, 233, 236, 257, 282, 299, 311, 312, 324, 355, 383, 390, 397, 398, 420, 432, 441, 451, 458, 470, 482, 484, 490, 505, 507, 512, 513, 535, 542, 543, 551, 553, 565, 569, 592, 626, 637, 650, 657, 719, 728, 730, 750, 751, 762, 768, 769, 777, 778, 779, 790, 792, 802, 808, 810, 853, 854, 873, 898, 904, 908, 943, 966, 980, 990},
                new int[]{  12, 32, 41, 48, 86, 131, 140, 143, 153, 154, 163, 174, 175, 206, 229, 230, 234, 293, 301, 307, 322, 329, 354, 361, 369, 381, 382, 424, 433, 439, 445, 448, 472, 473, 479, 496, 517, 526, 538, 548, 550, 557, 612, 636, 651, 659, 666, 681, 684, 697, 705, 772, 795, 799, 811, 818, 828, 829, 848, 859, 863, 877, 885, 888, 896, 927, 931, 988}));

    }
}