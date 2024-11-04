package week5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class demoDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 11, 30);
        System.out.println(date); // 2024-11-30
        System.out.println(date.getDayOfWeek()); // SATURDAY
        System.out.println(date.getDayOfMonth()); // 30
        System.out.println(date.getDayOfYear()); // 335
        System.out.println(date.plusDays(1)); // 2024-12-01
        System.out.println(date.plusMonths(2)); // 2025-01-30

        LocalDate date2 = LocalDate.of(2024, 11, 30);
        System.out.println(date.equals(date2)); // true
        System.out.println(date == date2); // false

        LocalDate date3 = LocalDate.of(2024, 12, 4);
        System.out.println(date2.compareTo(date3)); // -1
        System.out.println(date3.compareTo(date2)); // 1

        LocalDateTime dateTime = LocalDateTime.of(2024, 11, 1, 23, 55, 59);
        System.out.println(dateTime); // 2024-11-01T23:55:30
        System.out.println(dateTime.getSecond()); //59
        System.out.println(dateTime.plusSeconds(1)); // 2024-11-01T23:56

        Date date4 = new Date(12L);
        System.out.println(date4.getTime());
        
    }
}
