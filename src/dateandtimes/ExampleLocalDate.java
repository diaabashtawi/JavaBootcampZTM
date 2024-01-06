package dateandtimes;

import java.time.LocalDate;

public class ExampleLocalDate {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(1992, 7,3);
        LocalDate ld3 = LocalDate.parse("2024-01-06");

        System.out.println(ld1 + " \n" + ld2 + " \n" +ld3);
        System.out.println("-----------------------------------------");
        LocalDate ld4 = ld1.plusDays(5);
        System.out.println(ld4);
        System.out.println(ld3.getYear());
        System.out.println(ld3.getDayOfMonth());

    }
}
