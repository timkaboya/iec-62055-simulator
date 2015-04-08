package edu.cmu.iec62055simulator.token.attributes;

import java.util.Random;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/8/15.
 */
public class RND implements TokenAttribute {

    private final String NAME = "RND";  // RandomValue
    private String bits = "" ;

    public RND () {
        bits = generateBits() ;
    }

    public String getName() {
        return NAME ;
    }

    public String getBits() {
        return bits ;
    }

    private String generateBits() {
        return generateRandomVal() + ""
               + generateRandomVal()
               + generateRandomVal()
               + generateRandomVal() ;
    }

    private int generateRandomVal () {
        int min = 0;
        int max= 9 ;
        Random random = new Random() ;
        return random.nextInt((max - min) + 1) + min ;
    }
}
