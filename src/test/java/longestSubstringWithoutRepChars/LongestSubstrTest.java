package longestSubstringWithoutRepChars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstrTest {

    @Test
    void lengthLongestSubarray() {
        String s = "pwwkew";
        int expe = 3;
        LongestSubstr ls = new LongestSubstr();
        assertEquals(3, ls.lengthLongestSubarray(s));
    }
}