package findIndex1Ocurrence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndex1OTest {

    @Test
    void findInd() {
        String hays="sadbutsad";
        String needle="sad";
        FindIndex1O fi = new FindIndex1O();
        assertEquals(0,fi.findInd(hays,needle));
    }
}