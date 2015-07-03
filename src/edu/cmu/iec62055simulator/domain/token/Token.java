package edu.cmu.iec62055simulator.domain.token;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class Token extends Entity {

    private final Identifier TOKEN = Names.TOKEN ;

    public String getName () {
        return TOKEN.getName() ;
    }

    public String getAbbreviation () {
        return TOKEN.getAbbreviation() ;
    }
}
