package edu.cmu.iec62055simulator.domain.kmc;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Strings;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class KeyManagementCenter extends Entity {

    public final Identifier KMC = Strings.KMC  ;

    public String getName() {
        return KMC.getName() ;
    }

    public String getAbbreviation () {
        return KMC.getAbbreviation() ;
    }
}
