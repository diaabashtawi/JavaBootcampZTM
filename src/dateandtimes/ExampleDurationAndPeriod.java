package dateandtimes;

import java.time.Duration;
import java.time.Period;

public class ExampleDurationAndPeriod {
    public static void main(String[] args) {

        Duration duration1 = Duration.ofNanos(100000000);
        Duration duration2 = Duration.ofSeconds(100,1000);
        Duration duration3 = Duration.ofDays(7);
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println("*****************************************************");
        Period period1 = Period.of(10, 2, 3);
        Period period2 = Period.ofWeeks(12);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period2.getDays());
    }
}
