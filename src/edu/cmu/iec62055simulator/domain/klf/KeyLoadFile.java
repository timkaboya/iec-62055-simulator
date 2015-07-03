package edu.cmu.iec62055simulator.domain.klf;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class KeyLoadFile extends Entity {

    private final Identifier KLF = Names.KLF ;

    public String getName () {
        return KLF.getName() ;
    }

    public String getAbbreviation () {
        return KLF.getAbbreviation() ;
    }
}
