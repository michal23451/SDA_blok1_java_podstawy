package mojeTesty;


import java.time.Instant;
import java.util.Date;



public class DateInstantMain {

    public static void main(String[] args) {

        DateInstant dateAndInstantProvider = new DateInstant(); // tworzymy obiekt
        Date date = dateAndInstantProvider.getDate();
        Instant instant = dateAndInstantProvider.getInstant();

        System.out.println(date.hashCode() + " Date before: " + date);
        date.setTime(0L); // zmieniamy
        System.out.println(date.hashCode() + " Date after: " + dateAndInstantProvider.getDate()); // data jest zmieniona!

        System.out.println(instant.hashCode() + " Instant before: " + instant);
        instant.plusSeconds(60000); // zmieniamy
        System.out.println(instant.hashCode() + " Instant after: " + dateAndInstantProvider.getInstant()); // data taka sama

        Instant newInstant = instant;
        System.out.println(newInstant.hashCode() + " newInstant: " + newInstant); // zmieniona data w nowym obiekcie
        newInstant = instant.plusSeconds(60000);// zmieniamy
        System.out.println(newInstant.hashCode() + " newInstant: " + newInstant);

        String a = "test niemutowalności";
        System.out.println(a.hashCode());
        a += "xxxx";
        System.out.println(a.hashCode()); //nowy obiekt


    }
}
