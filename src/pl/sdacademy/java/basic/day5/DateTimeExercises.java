package pl.sdacademy.java.basic.day5;

/*
1.   Napisz funkcję, która przyjmie za parametr łańcuch znaków w formacie XXXX-XX-XX,
a która zwróci obiekt typu LocalDate, o odpowiedniej wartości.
2. Napisz funkcję, przyjmującą 3 parametry: godzine, minute, sekundę – zwróć obiekt LocalTime.
Stwórz 2 różne obiekty – sprawdź jaka jest między nimi różnica czasowa.
3. Napisz funkcję, która przyjmie za parametry obiekt typu LocalDate oraz LocalTime,
a która zwróci obiekt LocalDateTime o odpowiednich wartościach.

 */

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExercises {
    public static void main(String[] args) {
        System.out.println(stringToDate("2022-02-10"));
        System.out.println(intToTime(1,2,3));
        System.out.println(datetime(LocalDate.parse("2022-01-22"), LocalTime.parse("14:22:50")));

        LocalTime a, b;
        a = intToTime(12,0,0);
        b = intToTime(13,5,0);
        Duration roznica = Duration.between(a, b);
        System.out.println(roznica.toMinutes());


    }


    private static LocalDate stringToDate(String d) {
        return LocalDate.parse(d);
    }

    private static LocalTime intToTime(int h, int m, int s) {
        return LocalTime.of(h, m, s);
    }

    private static LocalDateTime datetime(LocalDate d, LocalTime t) {
        return LocalDateTime.of(d, t);
    }

}




