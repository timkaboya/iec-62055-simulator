package edu.cmu.iec62055simulator.domain.stsa;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class StandardTransferSpecificationAssociation extends Entity {

    private final Identifier EN_NAME = Names.STSA ;

    public String getName () {
        return EN_NAME.getName() ;
    }

    @Override
    public String getAbbreviation() {
        return EN_NAME.getAbbreviation();
    }
}
