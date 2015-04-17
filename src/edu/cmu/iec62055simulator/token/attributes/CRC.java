package edu.cmu.iec62055simulator.token.attributes;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/8/15.
 *
 * The CRC checksum field is used to verify the integrity of
 * the data transferred and is derived from the generator polynomial
 *
 * x^16 + x^15 + x^2 + 1
 *
 * It is derived from the previous 50 bits of the token and
 * is initially 0xFFFF
 *
 * Steps:
 *
 *      1. First generate a polynomial key
 *      1100 0000 0000 00101
 *
 *      2. Append sets of 0's to polynomial key with length polynomial key - 1 to data
 *      e.g. if data is 1100 1011 1001
 *
 *      then data appended becomes
 *      1100 0000 0000 00101 1100 1011 1001
 *
 *      3. Perform long division on the concatenated value, the reminder is
 *      the CRC transmitted with the data
 *      e.g.
 *                     |-------------------------------------
 *      1100 1011 1001 | 1100 0000 0000 00101 1100 1011 1001
 */
public class CRC implements TokenAttribute {

    private final String NAME = "CRC" ;
    private String bitsString  ;

    public CRC (String bitsString) {
        this.bitsString = bitsString ;
    }

    public String getName() {
        return NAME ;
    }

    public String getBits() {
        return generateCRC(bitsString) ;
    }

    private String generateCRC (String bitsString) {
        int bitStringVal = Integer.parseInt(bitsString, 2) ;

    }

    private int add (int a, int b) {
        int partialSum, carry ;
        do {
            partialSum = a ^ b;
            carry = (a & b) << 1;
            a = partialSum;
            b = carry;
        } while (carry != 0);
        return partialSum ;
    }

    private int subtract(int a, int b) {
        return add (a, add(~b, 1)) ;
    }
}
