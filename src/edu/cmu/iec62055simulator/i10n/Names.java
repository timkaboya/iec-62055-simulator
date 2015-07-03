package edu.cmu.iec62055simulator.i10n;

/**
 * Created by rmbitiru on 7/2/15.
 */
public class Names {

    // --- Names and abbreviations
    private static final String STSA_NAME = "Standard Transfer Standard Association" ;
    private static final String STSA_ABB = "StandardTransferSpecificationAssociation" ;
    private static final String KMC_NAME = "Key Management Center" ;
    private static final String KMC_ABB = "KeyManagementCenter" ;
    private static final String KLF_NAME = "Key Load File" ;
    private static final String KLF_ABB = "KeyLoadFile" ;
    private static final String CM_NAME = "Cryptographic Module" ;
    private static final String CM_ABB = "CM" ;
    private static final String POS_NAME = "Point of Sale" ;
    private static final String POS_ABB = "POS" ;
    private static final String SG_NAME = "Supply Group" ;
    private static final String SG_ABB = "SG" ;
    private static final String UTILITY_NAME = "Utility" ;
    private static final String COUNTRY_NAME = "Country" ;
    private static final String TOKEN_NAME = "Token" ;
    private static final String METER_NAME = "Meter" ;
    private static final String TOKEN_CARRIER_NAME = "Token Carrier" ;
    private static final String TARIFF_NAME = "Tariff" ;

    // Names and abbreviations of codes and numbers
    private static final String COUNTRY_CODE_NAME = "Country Code" ;
    private static final String COUNTRY_CODE_ABB = "CC" ;
    private static final String UTILITY_CODE_NAME = "Utility" ;
    private static final String UTILITY_CODE_ABB = "UC" ;
    private static final String SUPPLY_GROUP_CODE_NAME = "Supply Group Code" ;
    private static final String SUPPLY_GROUP_CODE_ABB = "SGC" ;
    private static final String KEY_MGMNT_CNTR_ID_NAME = "Key Management Center ID" ;
    private static final String KEY_MGMNT_CNTR_ABB = "KMCID" ;
    private static final String CRYPTOGRAPHIC_MODULE_ID_NAME = "Cryptographic Module ID" ;
    private static final String CRYPTOGRAPHIC_MODULE_ID_ABB = "CMID" ;
    private static final String CRYPTOGRAPHIC_MODULE_AUTH_CODE_NAME = "Cryptographic Module Authentication Code" ;
    private static final String CRYPTOGRAPHIC_MODULE_AUTH_CODE_ABB = "CMAC" ;
    private static final String KEY_REVISION_NUMBER_NAME = "Key Revision Number" ;
    private static final String KEY_REVISION_NUMBER_ABB = "KRN" ;
    private static final String KEY_EXPIRY_NUMBER_NAME = "Key Expiry Number" ;
    private static final String KEY_EXPIRY_NUMBER_ABB = "KEN" ;

    // Names and abbreviations of keys
    private static final String VENDING_KEY_NAME = "Vending Key" ;
    private static final String VENDING_KEY_ABB = "VK" ;
    private static final String KEY_EXCHANGE_KEY_NAME = "Key Exchange Key" ;
    private static final String KEY_EXCHANGE_KEY_ABB = "KEK" ;
    private static final String DECODER_KEY_NAME = "Decoder Key" ;
    private static final String DECODER_KEY_ABB = "DK" ;
    private static final String KEY_TYPE_NAME = "Key Type" ;
    private static final String KEY_TYPE_ABB = "KT" ;
    private static final String METER_PRIMARY_ACCOUNT_NUMBER_NAME = "Meter Personal Account Number" ;
    private static final String METER_PRIMARY_ACCOUNT_NUMBER_ABB = "MeterPAN" ;
    private static final String TOKEN_CARRIER_TYPE_NAME = "Token Carrier Type" ;
    private static final String TOKEN_CARRIER_TYPE_ABB = "TCT" ;

    // -- Identifier objects
    public static final Identifier STSA = new Identifier(STSA_NAME, STSA_ABB) ;
    public static final Identifier KMC = new Identifier(KMC_NAME, KMC_ABB) ;
    public static final Identifier KLF = new Identifier(KLF_NAME, KLF_ABB) ;
    public static final Identifier CM = new Identifier(CM_NAME, CM_ABB) ;
    public static final Identifier POS = new Identifier(POS_NAME, POS_ABB) ;
    public static final Identifier SG = new Identifier(SG_NAME, SG_ABB) ;
    public static final Identifier UTILITY = new Identifier(UTILITY_NAME, "") ;
    public static final Identifier COUNTRY = new Identifier(COUNTRY_NAME, "") ;
    public static final Identifier TOKEN = new Identifier(TOKEN_NAME, "") ;
    public static final Identifier METER = new Identifier(METER_NAME, "") ;
    public static final Identifier TOKEN_CARRIER = new Identifier(TOKEN_CARRIER_NAME, "") ;
    public static final Identifier TARRIFF = new Identifier(TARIFF_NAME, "") ;

    public static final Identifier COUNTRY_CODE = new Identifier(COUNTRY_CODE_NAME, COUNTRY_CODE_ABB) ;
    public static final Identifier UTILITY_CODE = new Identifier(UTILITY_CODE_NAME, UTILITY_CODE_ABB) ;
    public static final Identifier SUPPLY_GROUP_CODE = new Identifier(SUPPLY_GROUP_CODE_NAME, SUPPLY_GROUP_CODE_ABB) ;
    public static final Identifier KEY_MGMNT_CNTR_ID = new Identifier(KEY_MGMNT_CNTR_ID_NAME, KEY_MGMNT_CNTR_ABB) ;
    public static final Identifier CRYPTOGRAPHIC_MODULE_ID = new Identifier(CRYPTOGRAPHIC_MODULE_ID_NAME, CRYPTOGRAPHIC_MODULE_ID_ABB) ;
    public static final Identifier CRYPTOGRAPHIC_MODULE_AUTH_CODE = new Identifier(CRYPTOGRAPHIC_MODULE_AUTH_CODE_NAME, CRYPTOGRAPHIC_MODULE_AUTH_CODE_ABB) ;
    public static final Identifier KEY_REVISION_NUMBER = new Identifier(KEY_REVISION_NUMBER_NAME, KEY_REVISION_NUMBER_ABB) ;
    public static final Identifier KEY_EXPIRY_NUMBER = new Identifier(KEY_EXPIRY_NUMBER_NAME, KEY_EXPIRY_NUMBER_ABB) ;

    public static final Identifier VENDING_KEY = new Identifier(VENDING_KEY_NAME, VENDING_KEY_ABB) ;
    public static final Identifier KEY_EXCHANGE_KEY = new Identifier(KEY_EXCHANGE_KEY_NAME, KEY_EXCHANGE_KEY_ABB) ;
    public static final Identifier DECODER_KEY = new Identifier(DECODER_KEY_NAME, DECODER_KEY_ABB) ;
    public static final Identifier KEY_TYPE = new Identifier(KEY_TYPE_NAME, KEY_TYPE_ABB) ;
    public static final Identifier METER_PRIMARY_ACCOUNT_NUMBER = new Identifier(METER_PRIMARY_ACCOUNT_NUMBER_NAME, METER_PRIMARY_ACCOUNT_NUMBER_ABB) ;
    public static final Identifier TOKEN_CARRIER_TYPE = new Identifier(TOKEN_CARRIER_TYPE_NAME, TOKEN_CARRIER_TYPE_ABB) ;
}
