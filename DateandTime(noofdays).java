import java.time.*;
import java.time.temporal.ChronoUnit;

class No_Of_Days
{
    public static void main(String[] args)
    {
        LocalDate x = LocalDate.of(2003,2,6);
        System.out.println(x);
        LocalDate y = LocalDate.of(2024,8,16);
        System.out.println(y);
        long nofdays= ChronoUnit.DAYS.between(x,y);
        System.out.println(nofdays);
    }
}
