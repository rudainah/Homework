import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String date_string = "";

        while (true) {
            System.out.print("Enter the date (dd.MM.yyyy): ");
            date_string = scanner.next();

            int day = Integer.parseInt(date_string.substring(0, 2));
            int month = Integer.parseInt(date_string.substring(3, 5));
            int year = Integer.parseInt(date_string.substring(6, 10));

            if (year < 1 || month < 1 || month > 12 || day < 1 || day > 30) {
                System.out.println("Invalid date. Please enter a valid date.");
            } else {
                int next_day = day + 1;
                int next_month = month;
                int next_year = year;

                if (next_day > 30) {
                    next_day = 1;
                    next_month++;

                    if (next_month > 12) {
                        next_month = 1;
                        next_year++;
                    }
                }

                System.out.println("Next date: " + String.format("%02d.%02d.%04d", next_day, next_month, next_year));
                break;
            }
        }
        
    }

}
