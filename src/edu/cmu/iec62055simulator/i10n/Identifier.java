package edu.cmu.iec62055simulator.i10n;

/**
 * Created by rmbitiru on 7/2/15.
 */
public class Identifier {

    private String name ;
    private String abbreviation ;

    public Identifier () {}

    public Identifier (String name, String abbreviation) {
        setName (name) ;
        setAbbreviation (abbreviation) ;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
