package edu.cmu.iec62055simulator.domain.cm;

import edu.cmu.iec62055simulator.domain.Entity;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Strings;

/**
 * Created by rmbitiru on 7/2/15.
 */
public class CryptographicModule extends Entity {

    private final Identifier CM_NAME = Strings.STSA ;

    public String getName () {
        return CM_NAME.getName() ;
    }

    public String getAbbreviation () {
        return CM_NAME.getAbbreviation() ;
    }
}
