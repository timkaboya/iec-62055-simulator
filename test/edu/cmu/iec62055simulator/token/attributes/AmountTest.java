package edu.cmu.iec62055simulator.token.attributes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {

    private Amount amount ;
    private Amount amount2;

    @Before
    public void setUp() throws Exception {
        amount = new Amount() ;
        amount2 = new Amount(25.6) ;

    }

    @After
    public void tearDown() throws Exception {
        amount = amount2 = null ;
    }

    @Test
    public void testGetName() throws Exception {
       assertEquals("Test the name returned for the object", "Amount", amount.getName());
       assertEquals("Test the name returned for the object", "Amount", amount2.getName());
    }

    @Test
    public void testGetBits() throws Exception {
        assertEquals("Test Amount values in constructor", "0000000100000000", amount2.getBits());

        amount2.setBits(1638.3);
        assertEquals("Test Amount values in constructor", "0011111111111111", amount2.getBits());

        amount.setBits(0.1);
        assertEquals("Test bit value 0.1", "0000000000000001", amount.getBits());

        amount.setBits(1638.4);
        assertEquals("Test bit value 1638.4", "0100000000000000", amount.getBits());

        amount.setBits(18022.3);
        assertEquals("Test bit value 18022.3", "0111111111111111", amount.getBits());

        amount.setBits(18022.4);
        assertEquals("Test bit value 18022.4", "1000000000000000", amount.getBits());

        amount.setBits(181862.3);
        assertEquals("Test bit value 181862.3", "1011111111111111", amount2.getBits());

        amount.setBits(181862.4);
        assertEquals("Test bit value 181862.4", "1100000000000000", amount2.getBits());

        amount.setBits(1820162.4);
        assertEquals("Test bit value 1820162.4", "1111111111111111", amount2.getBits());
    }
}