import java.time.*;

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

        LocalDateTime dateTime=LocalDateTime.of(1995, Month.AUGUST,28,12,35);

        System.out.println("\n"+dateTime);

        System.out.println("After sox month : "+dateTime.plusMonths(6));

        System.out.println("Before 6 Months : "+ dateTime.minusMonths(6));

        LocalDate birthDay=LocalDate.of(1991,7,26);
        LocalDate today=LocalDate.now();
        Period p=Period.between(birthDay,today);
        System.out.printf("Your age is %d Years %d Months %d Days ",
                p.getYears(),p.getMonths(),p.getDays());
       LocalDate deathDay=LocalDate.of(1989+60,06,15);
       Period p1=Period.between(today,deathDay);

       int d=p1.getYears()*365+p1.getMonths()*30+p1.getDays();

       System.out.printf("\n You will be on the earth only %d Days..Hurry up to do important think",d);

    }
}