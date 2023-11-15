/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

public class AddingPrims {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int number = 2;

        while (count < 100) {
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
            number++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
}


