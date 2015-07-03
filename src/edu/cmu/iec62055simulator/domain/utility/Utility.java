package edu.cmu.iec62055simulator.domain.utility;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class Utility extends Entity {

    private final Identifier UTILITY = Names.UTILITY ;

    public String getName () {
        return UTILITY.getName() ;
    }

    public String getAbbreviation () {
        return UTILITY.getAbbreviation() ;
    }
}
