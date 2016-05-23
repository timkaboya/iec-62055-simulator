package edu.cmu.iec62055simulator.pos;

import edu.cmu.iec62055simulator.domain.bits.BitString;
import edu.cmu.iec62055simulator.i10n.Strings;
import edu.cmu.iec62055simulator.token.Token;

import java.util.ArrayList;

/**
 * This class models a Point of Sale system as
 * implemented on iec62055
 *
 * Created by rmbitiru on 7/3/15.
 */
public class PointOfSale {

    private BitString tokenClass  ;
    private BitString tokensubClass ;
    private Token.TokenType tokenType ;

    private ArrayList<BitString> validTokenClassTypes ;

    public PointOfSale () {
        initializeClassTypesSupported (validTokenClassTypes) ;
    }

    public void setTokenTypeString (BitString tokenClass, BitString tokenSubClass) {
        setTokenClass (tokenClass) ;
        setTokenSubClass (tokenSubClass) ;
    }

    public Token.TokenType getTokenType () {
        return tokenType ;
    }

    private void setTokenClass (BitString tokenClass) {
        if (null == tokenClass || tokenClass.getLength() != 2)
            throw new IllegalArgumentException(Strings.TOKEN_CLASS_INVALID_ERROR) ;
        this.tokenClass = tokenClass ;
    }

    private void setTokenSubClass (BitString tokensubClass) {
        if (null == tokensubClass || tokensubClass.getLength() != 2)
            throw new IllegalArgumentException(Strings.TOKEN_SUB_CLASS_INVALID_ERROR) ;
        this.tokensubClass = tokensubClass ;
    }

    private void initializeClassTypesSupported(ArrayList<BitString> validTokenClassTypes) {
        validTokenClassTypes = new ArrayList<BitString>() ;
        validTokenClassTypes.add(new BitString("00", Strings.CREDIT_TRANSFER)) ;
        validTokenClassTypes.add(new BitString("01", Strings.NON_METER_SPECIFIC_MANAGEMENT)) ;
        validTokenClassTypes.add(new BitString("02", Strings.METER_SPECIFIC_MANAGEMENT)) ;
        validTokenClassTypes.add(new BitString("03", Strings.RESERVED_FOR_FUTURE_ASSIGNMENT)) ;
    }
}
