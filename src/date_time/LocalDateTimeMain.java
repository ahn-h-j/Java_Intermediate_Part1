package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println("nowDt = " + nowDt);
        System.out.println("ofDt = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);

        LocalDateTime ofDtPlusYear = ofDtPlus.plusYears(1);
        System.out.println("ofDtPlusYear = " + ofDtPlusYear);

        System.out.println("isBefore : " + nowDt.isBefore(ofDt));
        System.out.println("isAfter : " + nowDt.isAfter(ofDt));
        System.out.println("isEqual : " + nowDt.isEqual(ofDt));
    }
}
