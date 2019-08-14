package capgemini_labbook;
import java.time.*;
import java.util.Scanner;

public class lab8_Ex6_ {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int month;
	int year,dayOfMonth;
	System.out.println("enter your date **/**/****");
    year=sc.nextInt();
	month=sc.nextInt();
	dayOfMonth=sc.nextInt();
	LocalDate pastdate= LocalDate.of(dayOfMonth, month, year);
	LocalDate now= LocalDate.now();
	
	Period diff=Period.between(pastdate, now);
	System.out.println("\nyear="+diff.getYears()+"\nmonths="+diff.getMonths()+"\ndays="+diff.getDays());
}
}
