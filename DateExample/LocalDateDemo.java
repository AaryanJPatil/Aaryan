package DateExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {
    
    public static void main(String[] args) {
        LocalDate Date =LocalDate.now();
        System.out.println(Date);
        System.out.println(Date.getDayOfMonth());
        System.out.println(Date.getMonthValue());
        System.out.println(Date.getYear());
        System.out.println(Date.getChronology());

        LocalDate newdate = LocalDate.of(2024, 11, 12);
        System.out.println(newdate.isLeapYear());

        LocalDate yesterday = Date.minusDays(200);
        System.out.println("Yesterday date is"+yesterday);

        LocalDate tommorow =Date.plusDays(1);
        System.out.println("Tommorow date is"+tommorow);

        LocalDateTime time = LocalDateTime.now();
        System.out.println("Local Date time is"+time);

        LocalDateTime time12 =LocalDateTime.of(2023, 9, 27, 12, 29, 10);
        System.out.println("Original user define"+time12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        String updatedFormat = time12.format(formatter);
        System.out.println("After updation"+updatedFormat);
    
    }
}
