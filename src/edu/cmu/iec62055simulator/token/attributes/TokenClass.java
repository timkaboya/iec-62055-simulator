package edu.cmu.iec62055simulator.token.attributes;

import java.util.zip.CRC32;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/7/15.
 */
public class TokenClass implements TokenAttribute {

    private final String NAME = "Class" ;
    private String bits = "00" ;


    public TokenClass (String bits) {
        this.bits = bits ;
    }

    public String getName() {
        return NAME ;
    }

    public String getBits() {
        return bits ;
    }

    public void setBits (String bits) throws IllegalBitValueException,
                                             NumberFormatException {
        final String ILLEGAL_BIT_LENGTH = "Bit length is invalid" ;
        if (bits.length() != 2) {
            throw new IllegalBitValueException (ILLEGAL_BIT_LENGTH) ;
        } else {
            try {
                Integer.parseInt(bits.substring(0,1)) ;
                Integer.parseInt(bits.substring(1,1)) ;
                this.bits = bits ;

            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
    }

    class IllegalBitValueException extends Exception {

        public IllegalBitValueException (String errorMessage) {
            super(errorMessage);
        }
    }
}
