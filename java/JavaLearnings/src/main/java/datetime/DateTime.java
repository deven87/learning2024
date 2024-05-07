package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {


        // get local date from system

        System.out.println(LocalDate.now());

        System.out.println(LocalTime.now());

        System.out.println(LocalDateTime.now());

        System.out.println(new Date());


        System.out.println(LocalDate.now().getDayOfMonth());

        System.out.println(LocalTime.now().getHour());

        LocalDate date = LocalDate.of(1987,5,5);

        Period p = Period.between(LocalDate.now(), date);

        System.out.println(p);



    }
}
