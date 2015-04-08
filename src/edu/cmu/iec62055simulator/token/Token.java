package edu.cmu.iec62055simulator.token;

import edu.cmu.iec62055simulator.token.attributes.*;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/7/15.
 */

public abstract class Token {

    private Type type;
    private TokenClass tokenClass ;
    private TokenSubClass tokenSubClass;
    private RND randomValue ;
    private TID tokenIdentifier ;
    private Amount amountPurchased ;
    private CRC crc ;
    public enum Type {
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

    public Token (Type type,
                  TokenClass tokenClass,
                  TokenSubClass tokenSubClass,
                  RND randomValue,
                  TID tokenIdentifier,
                  Amount amountPurchased,
                  CRC crc) {
        this.type = type ;
        this.tokenClass = tokenClass ;
        this.tokenSubClass = tokenSubClass;
        this.randomValue = randomValue ;
        this.tokenIdentifier = tokenIdentifier ;
        this.amountPurchased = amountPurchased ;
        this.crc = crc ;
    }

    public abstract TokenClass getTokenClass() ;

    public abstract TokenSubClass getTokenSubClass() ;

    public abstract RND getRND() ;

    public abstract TID getTID() ;

    public abstract Amount getAmountPurchased() ;

    public abstract CRC getCRC() ;

}
