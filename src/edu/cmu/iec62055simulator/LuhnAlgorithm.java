package edu.cmu.iec62055simulator;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/5/15.
 */
public class LuhnAlgorithm {

    /**
     * Uses the Luhn Algorithm to generate the check digit
     * for a sequence of bits
     * @param digitsString The string with the digits
     * @return
     */
    public static int generateDRNCheckDigit (String digitsString) {
        int sum = 0;
        int modulus = 10;
        boolean alternate = true ;
        for (int i = 0 ;  i < digitsString.length() ; i++) {
            int n = Integer.parseInt(digitsString.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        int upperBound = (int) (Math.ceil( (double) sum / modulus) * modulus) ;
        return  ( upperBound - sum );
    }
}
