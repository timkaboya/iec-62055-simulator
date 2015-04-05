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
        final String mfrCode1 = "33" ; // can be 2/4 digits
        final String DSN1 = "79513561" ; // 8 digits

        final String mfrCode2 = "4407" ; // can be 2 or 4 digits
        final String DSN2 = "83004143" ; // 8 digits

        assertNotNull("Assert that LuhnAlgorithm object is created", luhnAlgorithm);
        assertEquals("Test that a correct check digit 1 is created",
                        0, LuhnAlgorithm.generateDRNCheckDigit(mfrCode1, DSN1));
        assertEquals("Test that a correct check digit 2 is created",
                1, LuhnAlgorithm.generateDRNCheckDigit(mfrCode2, DSN2));
    }
}