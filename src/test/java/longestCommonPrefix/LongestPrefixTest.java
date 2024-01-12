package longestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPrefixTest {
   @Test
    void longestCommonPrefix() {
        String[] strs = {"Floght", "Flight", "Flown"};
        String exp = "Fl";
        LongestPrefix lp = new LongestPrefix();
        assertEquals(exp, lp.longestCommonPrefix(strs));
    }
    @Test
    void longestCommonPrefix2() {
        String[] strs = {"Floght"};
        String exp = "Floght";
        LongestPrefix lp = new LongestPrefix();
        assertEquals(exp, lp.longestCommonPrefix(strs));
    }
@Test
    void longestCommonPrefix3() {
        String[] strs = {};
        String exp = "";
        LongestPrefix lp = new LongestPrefix();
        assertEquals(exp, lp.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefix4() {
        String[] strs = {"car","run"};
        String exp = "";
        LongestPrefix lp = new LongestPrefix();
        assertEquals(exp, lp.longestCommonPrefix(strs));
    }
}