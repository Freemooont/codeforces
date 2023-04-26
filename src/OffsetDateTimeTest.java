import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeTest {
    public static void main(String[] args) {
        System.out.println(OffsetDateTime.now().atZoneSameInstant(ZoneId.of("CET")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(OffsetDateTime.now().atZoneSameInstant(ZoneId.of("UTC")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        //System.out.println(OffsetDateTime.now().atZoneSameInstant(ZoneId.of("AGT")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(Instant.now().atZone(ZoneId.of("CET")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
