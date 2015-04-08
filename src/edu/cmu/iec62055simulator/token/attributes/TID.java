package edu.cmu.iec62055simulator.token.attributes;

import org.joda.time.DateTime;
import org.joda.time.Minutes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ${FILE_NAME}
 * Created by rmbitiru on 4/8/15.
 */
public class TID implements TokenAttribute {

    private final String NAME = "TID" ;
    private String bits = "" ;
    private Date[] baseDates = {
            new GregorianCalendar(1993, Calendar.JANUARY, 1, 0, 0 ,0).getTime(),
            new GregorianCalendar(2014, Calendar.JANUARY, 1, 0, 0 ,0).getTime(),
            new GregorianCalendar(2035, Calendar.JANUARY, 1, 0, 0 ,0).getTime(),
    };

    public TID(Date timeOfIssue) {
        bits = generateTID(timeOfIssue) ;
    }

    public String getName() {
        return NAME ;
    }

    public String getBits() {
        return bits ;
    }

    public Date[] generateBaseDates () throws ParseException{
        return baseDates ;
    }

    public Date[] getBaseDates () {
        return baseDates ;
    }

    private String generateTID (Date timeOfIssue) {
        Calendar c = Calendar.getInstance() ;
        c.setTime(timeOfIssue) ;
        DateTime convertedDateOfIssue = new DateTime(c.get(Calendar.YEAR),
                                                     c.get(Calendar.MONTH),
                                                     c.get(Calendar.DAY_OF_MONTH),
                                                     c.get(Calendar.HOUR),
                                                     c.get(Calendar.MINUTE)) ; // When calculating the TID the “:ss” value shall be truncated from the actual time.

        DateTime refDateTime = new DateTime() ;
        for (int baseTimesCounter = 0 ; baseTimesCounter < baseDates.length ;
                baseTimesCounter++) {
            DateTime currentDateTime = new DateTime(baseDates[baseTimesCounter]) ;
            if (convertedDateOfIssue.isEqual(currentDateTime) ||
                    convertedDateOfIssue.isAfter(currentDateTime))
                refDateTime = currentDateTime ;
        }

        Minutes difference = Minutes.minutesBetween(convertedDateOfIssue, refDateTime)  ;
        int minutes = difference.getMinutes() ;
        return pad(minutes) ;
    }

    private String pad (int minutes) {
        final int NO_OF_BITS = 24 ;
        return String.format("%n" + NO_OF_BITS + "s",  Integer.toBinaryString(minutes))
                .replace(' ', '0') ;
    }
}
