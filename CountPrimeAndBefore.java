import java.util.Scanner;

public class CountPrimeAndBefore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit;
        int count = 0;

        while(true){
            System.out.print("Enter a positive number: ");
            limit = scanner.nextInt();

            if (limit <= 1) {
                System.out.println("Invalid input. Please enter a positive number greater than 1.");

            }else
                break;
        }

        for (int number = 2; number < limit; number++) {
            boolean is_prime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                count++;
            }
        }

        System.out.println("Number of prime numbers less than " + limit + ": " + count);
    }
}
