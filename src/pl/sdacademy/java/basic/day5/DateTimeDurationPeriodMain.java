package pl.sdacademy.java.basic.day5;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDurationPeriodMain {
    public static void main(String[] args) {
        System.out.println(Duration.ofHours(10).toMinutes());   // 10 godzin wyrażona w minutach: 600
// W przykładzie poniżej została wyliczona różnica czasu w minutach pomiędzy czasem obecnym a czasem o 2 dni póżniejszym
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes()); // 2880
// Poniżej została wyliczona liczba miesięcy pomiędzy dwoma datami
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(100)).getMonths());         // 3



        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);
        String formattedLocalTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(formattedLocalTime); // 21:11:00.024


    }
}
