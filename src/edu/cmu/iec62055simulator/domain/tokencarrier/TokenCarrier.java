package edu.cmu.iec62055simulator.domain.tokencarrier;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class TokenCarrier extends Entity {

    private final Identifier TOKEN_CARRIER = Names.TOKEN_CARRIER ;

    public final String getName () {
        return TOKEN_CARRIER.getName() ;
    }

    public final String getAbbreviation () {
        return TOKEN_CARRIER.getAbbreviation() ;
    }
}
