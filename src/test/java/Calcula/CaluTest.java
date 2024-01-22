package Calcula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaluTest {

    @Test
    void sumaaa() {
        int num1=1;
        int num2=2;
        Calu cal = new Calu();
        assertEquals(3, cal.sumaaa(1,2));
    }
}