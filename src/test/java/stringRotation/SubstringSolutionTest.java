package stringRotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringSolutionTest {

    @Test
    void isSubstring() {
        String s1= "Programation";
        String s2= "ion";
        SubstringSolution ss= new SubstringSolution();
        assertTrue(ss.isSubstring(s1,s2));
    }

    @Test
    void isSubstring2() {
        String s1= "Programation";
        String s2= "ionPro";
        SubstringSolution ss= new SubstringSolution();
        assertTrue(ss.isSubstring(s1,s2));
    }
}