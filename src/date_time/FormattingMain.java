package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 12, 31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        String formattedDate = localDate.format(formatter);
        System.out.println("formattedDate = " + formattedDate);

        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("parsedDate = " + parsedDate);
    }
}
