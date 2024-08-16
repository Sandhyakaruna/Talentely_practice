import java.time.*;
import java.time.temporal.ChronoUnit;

public class DandT
{
    public static void main(String[] args)
    {
        System.out.println("Local Time");
        LocalTime i=LocalTime.now();
        System.out.println(i);
        System.out.println("\nGMT");
        Instant j=Instant.now();
        System.out.println(j);
        LocalDate m = LocalDate.of(2003,2,6);
        System.out.println(m);
        LocalTime l = LocalTime.of(2,6);
        System.out.println(l);
        LocalDateTime z = LocalDateTime.of(2003,2,6,9,10);
        System.out.println(z);
        LocalDateTime z1 = LocalDateTime.of(2024,8,16,11,53);
        System.out.println(z1);
        long storemin= ChronoUnit.MINUTES.between(z,z1);
        System.out.println("mins lived "+storemin);
        LocalTime morning=LocalTime.of(11,30);
        System.out.println(morning);
        LocalTime night = LocalTime.of(23,30);//op=PT-->PeriodTime
        System.out.println(night);
        Duration p=Duration.between(morning,night);
        System.out.println("Difference time is "+p);
        System.out.println("\nFind the day from DOB");
        LocalDate x = LocalDate.of(2003,2,6);
        DayOfWeek day= DayOfWeek.from(x);
        System.out.println(day);
        LocalDate y = LocalDate.of(2024,8,16);
        DayOfWeek day1= y.getDayOfWeek();
        System.out.println(day1);
        long storenoofdays= ChronoUnit.DAYS.between(x,y);
        System.out.println(storenoofdays);

        //to get time at particular country
        System.out.println();
        for(String val:ZoneId.getAvailableZoneIds())
        {
            System.out.println(val);
        }
        LocalTime V=LocalTime.now(ZoneId.of("Europe/Bratislava"));
        System.out.println(V);
    }
}
