package edu.cmu.iec62055simulator.domain.country;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/2/15.
 */
public class Country extends Entity {

    private final Identifier COUNTRY = Names.COUNTRY ;

    public String getName() {
        return COUNTRY.getName() ;
    }

    public String getAbbreviation () {
        return COUNTRY.getAbbreviation() ;
    }
}
