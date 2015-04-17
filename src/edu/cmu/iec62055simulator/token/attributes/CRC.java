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

    // the polynomial key is defined in IEC620055-41
    // as X^16+x^15+x^2+1
    private final String POLYNOMIAL_KEY = "11000000000000101" ;

    public CRC() {}

    public CRC (String bitsString) {
        this.bitsString = bitsString ;
    }

    public String getName() {
        return NAME ;
    }

    public void setBitsString (String bitsString) {
        this.bitsString = bitsString ;
    }

    public String getBitsString() {
        return generateCRC() ;
    }

    /**
     * Returns the reminder which is equivalent to the CRC
     * @return
     */
    private String generateCRC () {

        // Append the required number of zeros - CRC size, 16
        String bitStringAndPaddingBits = bitsString.concat("0000000000000000") ;

        // Obtain remainder
        return getRemainder(bitStringAndPaddingBits, POLYNOMIAL_KEY) ;
    }

    /**
     * Code adapted from:
     * http://stackoverflow.com/questions/13297308/binary-division-issue-bad-examples-on-internet-or-what-am-i-missing
     * @param dividend
     * @param divisor
     * @return
     */
    private String getRemainder(String dividend, String divisor){

        int dividendLength = dividend.length();
        int divisorLength = divisor.length();

        String quotient="";
        String examinedP="";
        String substracted="";

        int indexNumber;
        int substractZeros=0;

        for (int i=0;i<divisorLength;i++){
            examinedP = examinedP + dividend.charAt(i);
        }

        indexNumber = divisorLength;

        for (int j=0;j<(dividendLength-divisorLength);j++){

            //START
            if ( Integer.parseInt(String.valueOf(examinedP.charAt(0)))==1){

                quotient=quotient + "1";
                int a = divisor.length();
                //substracting
                for (int i = 0;i<a;i++){
                    //  System.out.println(examinedP.charAt(i) + "  " +  divisor.charAt(i));
                    substracted = substracted +
                            CRC_substract(Integer.parseInt(String.valueOf(examinedP.charAt(i))),
                                    Integer.parseInt(String.valueOf(divisor.charAt(i))));
                }

                substracted = substracted.substring(1);
                substracted = substracted + dividend.charAt(indexNumber);
            }
            else {
                quotient=quotient + "0";
                int a = divisor.length();

                //substracting
                for (int i = 0;i<a;i++){
                    //System.out.println(examinedP.charAt(i) + "  " +  0);
                    substracted = substracted +
                            CRC_substract(Integer.parseInt(String.valueOf(examinedP.charAt(i))),
                                    0);
                }
                substracted = substracted.substring(1);
                substracted = substracted + dividend.charAt(indexNumber);
            }

            examinedP = substracted;
            substracted="";
            indexNumber++;
        }

        //counting remainder - if it starts with 0 - bye bye 0s..
        for (int i = 0;i<examinedP.length();i++){

            if (Integer.parseInt(String.valueOf(examinedP.charAt(i)))==0){
                substractZeros++;
            }
            else
                break;
        }

        examinedP = examinedP.substring(substractZeros);
        return examinedP;

    }

    private int CRC_substract(int a, int b){

        if (a==0 && b==0)
            return 0;
        else if (a==0 && b==1)
            return 1;
        else if (a==1 && b==0)
            return 1;
        else if (a==1 && b==1)
            return 0;

        return -1;
    }
}
