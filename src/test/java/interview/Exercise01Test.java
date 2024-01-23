package interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {

    @Test
    void validatePassword() {
        Exercise01 e1 = new Exercise01();
        assertEquals(e1.validatePassword("Jua@n1lala"),true);
    }}
}