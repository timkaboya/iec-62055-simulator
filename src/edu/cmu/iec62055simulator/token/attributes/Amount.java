package edu.cmu.iec62055simulator.token.attributes;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/8/15.
 */
public class Amount implements TokenAttribute {

    private final String NAME = "Amount" ;
    private String bits = "" ;

    public Amount (double unitsPurchased) {
        bits = generateBits (unitsPurchased) ;
    }

    public String getName() {
        return NAME ;
    }

    public String getBits() {
        return bits ;
    }

    private String generateBits (double unitsPurchased) {
        return "" ;
    }
}
