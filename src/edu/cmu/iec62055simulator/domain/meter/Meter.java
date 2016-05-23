package edu.cmu.iec62055simulator.domain.meter;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Strings;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class Meter extends Entity {

    private final Identifier METER = Strings.METER ;

    public String getName () {
        return METER.getName() ;
    }

    public String getAbbreviation() {
        return METER.getAbbreviation() ;
    }
}
