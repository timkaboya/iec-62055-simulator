package edu.cmu.iec62055simulator;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/5/15.
 */
public class LuhnAlgorithm {

    /**
     * Uses the Luhn Algorithm to generate the DRN (Decoder Check Digit) check digit
     * @param mfrCode (Manufacturer code) A number to uniquely identify the payment meter manufacturer
     * @param DSN  (Decoder Serial Number) An 8 digit number allocated by the manufacturer
     * @return
     */
    public static int generateDRNCheckDigit (String mfrCode, String DSN) {
        String digitsString = mfrCode.concat(DSN) ;
        return getCheckDigit(digitsString) ;
    }

    /**
     * Uses the Luhn Algorithm to generate the PANCheckDigit
     * @param IIN (IssuerIdentificationNumber) 4/6 digits
     * @param IAIN_DRN (IndividualAccountIdentificationNumber or DecoderReferenceNumber)  111/13 digits
     * @return
     */
    public static int generatePANCheckDigit (String IIN, String IAIN_DRN) {
        String digitsString = IIN.concat(IAIN_DRN);
        return getCheckDigit(digitsString) ;
    }

    private static int getCheckDigit (String digitsString) {
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
