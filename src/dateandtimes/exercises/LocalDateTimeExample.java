package dateandtimes.exercises;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime eventDateTime = LocalDateTime.of(2024, 11, 12, 18, 0);
        System.out.println("Event date and time : " + eventDateTime);
    }
}
