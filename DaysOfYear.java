import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date (yyyy-MM-dd): ");
        String date_string = scanner.next();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputDate = LocalDate.parse(date_string, formatter);

        LocalDate beginningOfYear = LocalDate.of(inputDate.getYear(), 1, 1);

        long daysFromBeginning = inputDate.toEpochDay() - beginningOfYear.toEpochDay();

        System.out.println("Number of days from the beginning of the year: " + daysFromBeginning);
    }
}
