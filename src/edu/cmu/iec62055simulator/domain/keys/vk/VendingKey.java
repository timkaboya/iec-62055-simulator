package edu.cmu.iec62055simulator.domain.keys.vk;

import edu.cmu.iec62055simulator.domain.keys.Key;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Strings;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class VendingKey extends Key {

    private final Identifier VENDING_KEY = Strings.VENDING_KEY ;

    public String getName ()  {
        return VENDING_KEY.getName() ;
    }

    public String getAbbreviation () {
        return VENDING_KEY.getAbbreviation() ;
    }
}
