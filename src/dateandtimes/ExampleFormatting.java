package dateandtimes;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class ExampleFormatting {
    public static void main(String[] args) {
        LocalDateTime now= LocalDateTime.now();
        LocalDate today = LocalDate.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(dateFormatter.format(now));
        System.out.println(dateFormatter.format(today));
        System.out.println("********************************************************");
        LocalDate ld = LocalDate.parse("03/July/1992", dateFormatter);
        System.out.println(ld);
        System.out.println(ld.format(DateTimeFormatter.ISO_DATE));
        System.out.println(ld.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println("********************************************************");
        DateTimeFormatterBuilder dateTimeFormatterBuilder =
                new DateTimeFormatterBuilder();
        DateTimeFormatter dateTimeFormatter1 =
                dateTimeFormatterBuilder.appendLiteral("The Date is : ")
                        .appendValue(ChronoField.DAY_OF_MONTH)
                        .appendLiteral("/")
                        .appendValue(ChronoField.MONTH_OF_YEAR)
                        .toFormatter();
        System.out.println(ld.format(dateTimeFormatter1));

    }
}
