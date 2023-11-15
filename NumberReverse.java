import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversed_number = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed_number = reversed_number * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed integer: " + reversed_number);
    }
}
