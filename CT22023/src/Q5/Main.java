package Q5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fullDateformat  = DateTimeFormatter.ofPattern("EEEE,MMMM dd,yyyy");
        System.out.println(LocalDate.now().format(fullDateformat ));
    }
}
