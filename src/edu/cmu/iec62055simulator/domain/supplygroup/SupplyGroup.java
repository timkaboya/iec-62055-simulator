package edu.cmu.iec62055simulator.domain.supplygroup;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class SupplyGroup extends Entity {

    private final Identifier SP = Names.SG ;

    public String getName() {
        return SP.getName() ;
    }

    public String getAbbreviation () {
        return SP.getAbbreviation() ;
    }
}
