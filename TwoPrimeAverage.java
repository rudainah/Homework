import java.util.Scanner;

public class TwoPrimeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        int sum = 0;
        int count = 0;

        while(true){
            System.out.print("Enter the first integer: ");
            start = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            end = scanner.nextInt();

            if (start >= end) {
                System.out.println("Invalid input. The first integer should be less than the second.");
            }else
                break;
        }

        for (int number = start; number <= end; number++) {
            if (number >= 2) {
                boolean is_prime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        is_prime = false;
                        break;
                    }
                }
                if (is_prime) {
                    sum = sum + number;
                    count++;
                }
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of prime numbers between " + start + " and " + end + ": " + average);
        }else 
            System.out.println("No prime numbers found between " + start + " and " + end);
        
    }
}
