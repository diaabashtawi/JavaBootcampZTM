package dateandtimes;

import java.time.LocalTime;

public class ExampleLocalTime {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(6, 30, 12);
        LocalTime lt3 = LocalTime.parse("15:45:31");
        System.out.println(lt1 + "\n" + lt2 + "\n" + lt3);
        System.out.println("****************************************");
        LocalTime lt4 = lt1.plusHours(2);
        System.out.println(lt4);
    }
}
