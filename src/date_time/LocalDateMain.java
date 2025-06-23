package date_time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013,11,21);

        System.out.println("ofDate = " + ofDate);
        System.out.println("nowDate = " + nowDate);

        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("plusDays = " + plusDays);
    }
}
