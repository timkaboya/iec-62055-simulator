package edu.cmu.iec62055simulator.token.attributes;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/8/15.
 */
public class CRC implements TokenAttribute {

    private final String NAME = "CRC" ;
    private String bits = "" ;
    
    public CRC () {

    }

    public String getName() {
        return NAME ;
    }

    public String getBits() {
        return bits ;
    }
}
