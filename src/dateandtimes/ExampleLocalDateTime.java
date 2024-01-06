package dateandtimes;

import java.time.LocalDateTime;

public class ExampleLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(
                2024,
                01,
                06,
                13,
                04,
                15
        );
        LocalDateTime localDateTime3 = LocalDateTime.parse(
                "2004-11-12T22:07:23"
        );
        System.out.println(localDateTime1 + "\n" + localDateTime2 + "\n" + localDateTime3);
        System.out.println("************************************************************");
        LocalDateTime localDateTime4 = localDateTime1.minusWeeks(2);
        System.out.println(localDateTime4);

    }
}
