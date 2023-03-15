package lecture06;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter next SDA class date");
        String date = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, dtf);

        Period period = Period.between(LocalDate.now(), localDate);
        System.out.println(period.getDays() + " day until next class");
    }
}
