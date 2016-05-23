package edu.cmu.iec62055simulator.domain.identifiers;

import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Strings;

/**
 * Created by rmbitiru on 7/3/15.
 */
public final class Identifers {

    public static final Identifier STSA = new Identifier(Strings.STSA_NAME, Strings.STSA_ABB) ;
    public static final Identifier KMC = new Identifier(Strings.KMC_NAME, Strings.KMC_ABB) ;
    public static final Identifier KLF = new Identifier(Strings.KLF_NAME, Strings.KLF_ABB) ;
    public static final Identifier CM = new Identifier(Strings.CM_NAME, Strings.CM_ABB) ;
    public static final Identifier POS = new Identifier(Strings.POS_NAME, Strings.POS_ABB) ;
    public static final Identifier SG = new Identifier(Strings.SG_NAME, Strings.SG_ABB) ;
    public static final Identifier UTILITY = new Identifier(Strings.UTILITY_NAME, "") ;
    public static final Identifier COUNTRY = new Identifier(Strings.COUNTRY_NAME, "") ;
    public static final Identifier TOKEN = new Identifier(Strings.TOKEN_NAME, "") ;
    public static final Identifier METER = new Identifier(Strings.METER_NAME, "") ;
    public static final Identifier TOKEN_CARRIER = new Identifier(Strings.TOKEN_CARRIER_NAME, "") ;
    public static final Identifier TARRIFF = new Identifier(Strings.TARIFF_NAME, "") ;

    public static final Identifier COUNTRY_CODE = new Identifier(Strings.COUNTRY_CODE_NAME, Strings.COUNTRY_CODE_ABB) ;
    public static final Identifier UTILITY_CODE = new Identifier(Strings.UTILITY_CODE_NAME, Strings.UTILITY_CODE_ABB) ;
    public static final Identifier SUPPLY_GROUP_CODE = new Identifier(Strings.SUPPLY_GROUP_CODE_NAME, Strings.SUPPLY_GROUP_CODE_ABB) ;
    public static final Identifier KEY_MGMNT_CNTR_ID = new Identifier(Strings.KEY_MGMNT_CNTR_ID_NAME, Strings.KEY_MGMNT_CNTR_ABB) ;
    public static final Identifier CRYPTOGRAPHIC_MODULE_ID = new Identifier(Strings.CRYPTOGRAPHIC_MODULE_ID_NAME, Strings.CRYPTOGRAPHIC_MODULE_ID_ABB) ;
    public static final Identifier CRYPTOGRAPHIC_MODULE_AUTH_CODE = new Identifier(Strings.CRYPTOGRAPHIC_MODULE_AUTH_CODE_NAME, Strings.CRYPTOGRAPHIC_MODULE_AUTH_CODE_ABB) ;
    public static final Identifier KEY_REVISION_NUMBER = new Identifier(Strings.KEY_REVISION_NUMBER_NAME, Strings.KEY_REVISION_NUMBER_ABB) ;
    public static final Identifier KEY_EXPIRY_NUMBER = new Identifier(Strings.KEY_EXPIRY_NUMBER_NAME, Strings.KEY_EXPIRY_NUMBER_ABB) ;

    public static final Identifier VENDING_KEY = new Identifier(Strings.VENDING_KEY_NAME, Strings.VENDING_KEY_ABB) ;
    public static final Identifier KEY_EXCHANGE_KEY = new Identifier(Strings.KEY_EXCHANGE_KEY_NAME, Strings.KEY_EXCHANGE_KEY_ABB) ;
    public static final Identifier DECODER_KEY = new Identifier(Strings.DECODER_KEY_NAME, Strings.DECODER_KEY_ABB) ;
    public static final Identifier KEY_TYPE = new Identifier(Strings.KEY_TYPE_NAME, Strings.KEY_TYPE_ABB) ;
    public static final Identifier METER_PRIMARY_ACCOUNT_NUMBER = new Identifier(Strings.METER_PRIMARY_ACCOUNT_NUMBER_NAME, Strings.METER_PRIMARY_ACCOUNT_NUMBER_ABB) ;
    public static final Identifier TOKEN_CARRIER_TYPE = new Identifier(Strings.TOKEN_CARRIER_TYPE_NAME, Strings.TOKEN_CARRIER_TYPE_ABB) ;
}
