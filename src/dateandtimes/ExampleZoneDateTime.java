package dateandtimes;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Amman"));
        System.out.println(zonedDateTime1.getZone());
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println("**********************************");
        for (String zoneId : ZoneId.getAvailableZoneIds()){
            System.out.println(zoneId);
        }
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("Egypt"));
        System.out.println(zonedDateTime3);
    }
}
