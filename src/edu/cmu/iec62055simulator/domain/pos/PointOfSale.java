package edu.cmu.iec62055simulator.domain.pos;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class PointOfSale extends Entity {

    private final Identifier POS = Names.POS ;

    public String getName () {
        return POS.getName() ;
    }

    public String getAbbreviation() {
        return POS.getAbbreviation() ;
    }
}
