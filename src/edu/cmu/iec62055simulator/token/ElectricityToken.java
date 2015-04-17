package edu.cmu.iec62055simulator.token;

import edu.cmu.iec62055simulator.token.attributes.*;

import java.util.Date;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/17/15.
 */
public class ElectricityToken extends Token {

    private String TOKEN_CLASS_IDENTIFIER = "00" ;
    private TokenSubClass.Type tokenSubClassType = TokenSubClass.Type.ELECTRICITY ;

    public ElectricityToken(Date dateOfIssue, double amountPurchased) {
        super() ;
        setType(Type.TransferCredit);
        setTokenClass(new TokenClass(TOKEN_CLASS_IDENTIFIER));
        setRandomValue(new RND());
        setTokenIdentifier(new TID(dateOfIssue));
        setAmountPurchased(new Amount(amountPurchased));
        setCrc(generateCRC());
    }

    private CRC generateCRC() {
        String bitString = getTokenClass().getBitsString()
                + getTokenSubClass().getBitsString()
                + getRND().getBitsString()
                + getTID().getBitsString()
                + getAmountPurchased().getBitsString() ;
        return  new CRC(bitString);
    }

    public String getBitString() {
        return getTokenClass().getBitsString()
                + getTokenSubClass().getBitsString()
                + getRND().getBitsString()
                + getTID().getBitsString()
                + getAmountPurchased().getBitsString()
                + getCrc().getBitsString() ;
    }
}
