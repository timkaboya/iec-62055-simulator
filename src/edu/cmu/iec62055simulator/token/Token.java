package edu.cmu.iec62055simulator.token;

import edu.cmu.iec62055simulator.token.attributes.*;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/7/15.
 */

public abstract class Token {

    private TokenType tokenType;
    private TokenClass tokenClass ;
    private TokenSubClass tokenSubClass;
    private RND randomValue ;
    private TID tokenIdentifier ;
    private Amount amountPurchased ;
    private CRC crc ;
    public enum TokenType {
        TransferCredit,
        InitiateMeterTestOrDisplay,
        SetMaximumPowerLimit,
        ClearCredit,
        SetTariffRate,
        Set1stSectionDecoderKey,
        Set2ndSectionDecoderKey,
        ClearTamperCondition,
        SetMaximumPhasePowerUnbalanceLimit,
        SetWaterMeterFactor,
        ReservedForSTSUse,
        ReservedForProprietaryUse
    } ;

    public Token() {}

    public Token (TokenType tokenType,
                  TokenClass tokenClass,
                  TokenSubClass tokenSubClass,
                  RND randomValue,
                  TID tokenIdentifier,
                  Amount amountPurchased,
                  CRC crc) {
        this.setTokenType(tokenType);
        this.setTokenClass(tokenClass);
        this.setTokenSubClass(tokenSubClass);
        this.setRandomValue(randomValue);
        this.setTokenIdentifier(tokenIdentifier);
        this.setAmountPurchased(amountPurchased);
        this.setCrc(crc);
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public void setTokenClass(TokenClass tokenClass) {
        this.tokenClass = tokenClass;
    }

    public void setTokenSubClass(TokenSubClass tokenSubClass) {
        this.tokenSubClass = tokenSubClass;
    }

    public RND getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(RND randomValue) {
        this.randomValue = randomValue;
    }

    public TID getTokenIdentifier() {
        return tokenIdentifier;
    }

    public void setTokenIdentifier(TID tokenIdentifier) {
        this.tokenIdentifier = tokenIdentifier;
    }

    public void setAmountPurchased(Amount amountPurchased) {
        this.amountPurchased = amountPurchased;
    }

    public CRC getCrc() {
        return crc;
    }

    public void setCrc(CRC crc) {
        this.crc = crc;
    }

    public TokenClass getTokenClass() {
        return tokenClass ;
    }

    public TokenSubClass getTokenSubClass() {
        return tokenSubClass ;
    }

    public RND getRND() {
        return getRandomValue();
    }

    public TID getTID() {
        return getTokenIdentifier();
    }

    public Amount getAmountPurchased() {
        return amountPurchased ;
    }

    public CRC getCRC() {
        return getCrc();
    }

    public abstract String getBitString() ;

    public TokenType getTokenType() {
        return tokenType;
    }

}
