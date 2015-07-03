package edu.cmu.iec62055simulator.domain.keys.dk;

import edu.cmu.iec62055simulator.domain.keys.Key;
import edu.cmu.iec62055simulator.i10n.Identifier;
import edu.cmu.iec62055simulator.i10n.Names;

/**
 * Created by rmbitiru on 7/3/15.
 */
public class DecoderKey extends Key {

    private final Identifier DECODER_KEY = Names.DECODER_KEY ;

    public String getName () {
        return DECODER_KEY.getName() ;
    }

    public String getAbbreviation () {
        return DECODER_KEY.getAbbreviation() ;
    }
}
