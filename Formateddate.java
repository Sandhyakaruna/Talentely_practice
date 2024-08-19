import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class retrive {
    public static void main(String[]args) {
        LocalDateTime n= LocalDateTime.now();
        System.out.println("LocalTime"+n);
        DateTimeFormatter formatter1=
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate1= n.format(formatter1);
        System.out.println("DD/MM/YYYY: " + formattedDate1);
        DateTimeFormatter formatter2=
                DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate2= n.format(formatter2);
        System.out.println("Month DD, YYYY: " + formattedDate2);
        DateTimeFormatter formatter3=
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
        String formattedDate3= n.format(formatter3);
        System.out.println("YYYY-MM-DDTHH:MM: " + formattedDate3);
    }
}
