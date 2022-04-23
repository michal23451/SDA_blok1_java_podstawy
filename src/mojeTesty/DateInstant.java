package mojeTesty;

import java.time.Instant;
import java.util.Date;


public class DateInstant {

    // Stworzenie obiektu klasy DateAndInstantProvider
    // automatycznie zainicjuje obiekty date i instant
    private Date date = new Date();
    private Instant instant = Instant.now();

    public Date getDate() {
        return date;
    }

    public Instant getInstant() {
        return instant;
    }

}
