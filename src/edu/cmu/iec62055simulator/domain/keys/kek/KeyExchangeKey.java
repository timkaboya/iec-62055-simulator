package edu.cmu.iec62055simulator.domain.keys.kek;

import edu.cmu.iec62055simulator.domain.keys.Key;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class KeyExchangeKey extends Key {

    private final Identifier KEY_EXCHANGE_KEY = Names.KEY_EXCHANGE_KEY ;

    public String getName () {
        return KEY_EXCHANGE_KEY.getName() ;
    }

    public String getAbbreviation () {
        return KEY_EXCHANGE_KEY.getAbbreviation() ;
    }
}
