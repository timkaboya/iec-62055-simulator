package edu.cmu.iec62055simulator.domain.bits;

import edu.cmu.iec62055simulator.i10n.Strings;

/**
 * This class defines a bit String
 * Created by rmbitiru on 7/3/15.
 */
public class BitString {

    private String bitString = "" ;
    private String bitStringName =  "" ;

    public BitString () {}

    public BitString (String bitString) {
        setBitString (bitString) ;
    }

    public BitString (String bitString, String bitStringName) {
        setBitString(bitString);
        setBitStringName (bitStringName) ;
    }

    public String getBitString () {
        return bitString ;
    }

    public void setBitString (String bitString) throws IllegalArgumentException {
        final String BIT_STRING_CONTENT_ERROR = Strings.BIT_STRING_CONTENT_ERROR ;
        if (null != bitString && bitString.matches("^[0-1]*"))
            throw new IllegalArgumentException(BIT_STRING_CONTENT_ERROR) ;

        this.bitString = bitString ;
    }

    public int getLength () {
        return bitString.length() ;
    }

    public String getBitStringName () {
        return bitStringName ;
    }

    public void setBitStringName (String bitStringName) {
        this.bitStringName = bitStringName ;
    }
}
