package edu.cmu.iec62055simulator.token.attributes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CRCTest {

    private CRC crc1 ;
    private CRC crc2 ;
    private final String BIT_STRING = "00000000000000000100101000101101100100000000111111110010" ;

    @Before
    public void setUp() throws Exception {
        crc1 = new CRC();
        crc2 = new CRC(BIT_STRING) ;
    }

    @After
    public void tearDown() throws Exception {
        crc1 = crc2 = null ;
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("Test the name returned for the object", "CRC", crc1.getName());
        assertEquals("Test the name returned for the object", "CRC", crc2.getName());
    }

    @Test
    public void testThatCorrectCRCValuesAreGenerated() throws Exception {
        crc1.setBitsString("00000000000100101000101101100100000000111111110010");
        assertEquals("Test generation of CRC from crc1", "0000111111111010", crc1.getBitsString());
        assertEquals("Test generation of CRC from crc2", "0000111111111010", crc2.getBitsString());

        // @TODO: Add more tests...
    }
}