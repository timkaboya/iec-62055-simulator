package edu.cmu.iec62055simulator.token.attributes;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/8/15.
 */
public class TokenSubClass implements TokenAttribute {

    private Type type ;
    private final String NAME = "SubClass" ;
    public enum Type {
        ELECTRICITY ("0000"), // 0
        WATER ("0001"), // 1
        GAS ("0010"), // 2
        TIME("0011"), // 3
        CURRENCY("0100"); // 4
        // @TODO: 5-15: not implemenented since not defined in standard

        private String bitSequence = "" ;

        Type (String bitSequence) {
            this.bitSequence = bitSequence ;
        }

        String getBitSequence () {
            return bitSequence ;
        }
    };

    public TokenSubClass  (Type type) {
        this.type = type ;
    }

    public String getName() {
        return NAME ;
    }

    public String getBitsString() {
        return type.getBitSequence() ;
    }
}
