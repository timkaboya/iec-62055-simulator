package edu.cmu.iec62055simulator.token.attributes;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/8/15.
 */
public class Amount implements TokenAttribute {

    private final String NAME = "Amount" ;
    private double unitsPurchased;

    public Amount() {}

    public Amount (double unitsPurchased) {
        this.unitsPurchased = unitsPurchased ;
    }

    public String getName() {
        return NAME ;
    }

    public String getBits() {
        return generateBits(unitsPurchased) ;
    }

    public void setBits (double unitsPurchased) {
        this.unitsPurchased = unitsPurchased ;
    }

    private String generateBits (double unitsPurchased) {
        FixU_2_14 t = new FixU_2_14() ;
        int p = (int) (unitsPurchased * 10) ;
        double r = t.process(p) ;
        // double r = t.process2(p) ;

        return padTo16Digits(Integer.toBinaryString((int) r));
    }

    // @TODO: resolve for values >= 18022.3
    static class FixU_2_14 {

        public double process(int bits) {
            double mantissa = bits & 0x3FFF ;
            double n = 1.0 ;
            double m = 0.0 ;

            for (int i = (bits >> 14) & 0x3; i > 0; --i) {
                n *= 10.0;
                m *= 10;
                m++;
            }
            double value = n * mantissa + m * 16384;
            return value  ;
        }

        public double process2 (int bits) {
            double mantissa = bits & 0x3FFF ;
            double n = 1.0 ;
            double m = 0.0 ;

            for (int i = (bits >> 14) & 0x3; i > 0; --i) {
                n *= 10.0;
                m *= 10;
                m++;
            }
            double value = n * mantissa + m * 16384;
            return value  ;
        }
    }


    // @TODO: resolve for bitstrings > 16 where subtraction
    // operation in substring() yields negative value
    private String padTo16Digits (String bitsString) {
        String b = bitsString ;
        String s = "0000000000000000".substring(0, 16 - bitsString.length()) + bitsString;
        return  s ;
    }
}
