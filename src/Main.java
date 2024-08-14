import java.time.LocalDate;
import java.time.LocalDateTime;
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

        int hour=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        int nano=time.getNano();

        System.out.printf("%d:%d:%d:%d" ,hour,min,sec,nano);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(" ");
        System.out.println("Date Time API ");

        System.out.println(dt);

        int dd=dt.getDayOfMonth();
        int mm=dt.getMonthValue();
        int yy=dt.getYear();
        System.out.printf("Date : %d-%d-%d",dd,mm,yy);

        System.out.println(" ");
        int h=dt.getHour();
        int m=dt.getMinute();
        int s=dt.getSecond();
        int n=dt.getNano();


        System.out.printf("\n Time : %d:%d:%d:%d" ,h,m,s,n);

    }
}