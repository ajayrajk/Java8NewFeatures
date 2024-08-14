import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LocalDate date=LocalDate.now();
        System.out.println("Current Date : " + date);

        LocalTime time=LocalTime.now();
        System.out.println("Current Time : " + time);

        int day= date.getDayOfMonth();
        int month= date.getMonthValue();
        int year=date.getYear();

        System.out.println("Current day : " + day + " month : "+ month +" year :" +year);


    }
}