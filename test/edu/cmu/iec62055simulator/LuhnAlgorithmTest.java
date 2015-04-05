package edu.cmu.iec62055simulator;

import org.junit.After;
import org.junit.Before;
import edu.cmu.iec62055simulator.LuhnAlgorithm ;
import org.junit.Test;

import static org.junit.Assert.*;

public class LuhnAlgorithmTest {

    private LuhnAlgorithm luhnAlgorithm ;

    @Before
    public void setUp() throws Exception {
        luhnAlgorithm = new LuhnAlgorithm() ;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testThatCorrectModulus10DigitIsCreated () {
        final String STRING_TO_VERIFY = "337951356110879" ;
        final String STRING2_TO_VERIFY = "440783004143586" ;
        assertNotNull("Assert that LuhnAlgorithm object is created", luhnAlgorithm);
        assertEquals("Test that a correct check digit 1 is created",
                        5, LuhnAlgorithm.generateDRNCheckDigit(STRING_TO_VERIFY));
        assertEquals("Test that a correct check digit 2 is created",
                9, LuhnAlgorithm.generateDRNCheckDigit(STRING2_TO_VERIFY));
    }
}