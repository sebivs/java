import java.time.LocalDateTime;
import java.time.LocalTime;

public class TernaryOperator {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();

        String perioada = ora >= 12 ? "PM" : "AM";


        System.out.println(ora + ":" + minute + " " + perioada );

        for (int i = 0; i<5; i++) {
            System.out.println(i);


            }
        }




    }
