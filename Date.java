import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        /*
         *  yyyy-MM-dd	"1988-09-29"
         *  dd/MM/yyyy	"29/09/1988"
         *  dd-MMM-yyyy	"29-Sep-1988"
         *  E, MMM dd yyyy	"Thu, Sep 29 1988"
         */
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Date & Time: "+dateTime);
        //System.out.println("By Format: "+ Format);

        String formattedDate = dateTime.format(Format);
        System.out.println(formattedDate);
    }
}
