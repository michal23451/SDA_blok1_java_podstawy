package pl.sdacademy.java.basic.day5;

import java.time.*;
import java.util.Date;

public class DataiCzas {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.withNano(0)); //bez nanosekund
        System.out.println(localTime.withNano(0).withSecond(0)); //bez sekund

        LocalTime localTime2 = LocalTime.of(22,43,4);
        LocalTime localTime3 = LocalTime.parse("22:04:21");
        System.out.println(localTime2);
        System.out.println(localTime3);

        LocalDate locatDate = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(1990,12,1);
        System.out.println(locatDate);
        System.out.println(localDate2);

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1.withNano(0));

        Instant a = Instant.now();
        System.out.println(a);

        //klasy Duration i Period

        System.out.println("\n\n\n");
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(d.getDayOfWeek());
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println(d1);
        Instant b = Instant.now();
        System.out.println(b);



    }
}
