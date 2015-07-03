package edu.cmu.iec62055simulator.domain.tariff;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class Tariff extends Entity {

    private final Identifier TARIFF = Names.TARRIFF ;

    public String getName() {
        return TARIFF.getName() ;
    }

    public String getAbbreviation () {
        return TARIFF.getAbbreviation() ;
    }
}
