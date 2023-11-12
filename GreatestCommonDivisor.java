/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Find the Greatest Common Divisor \n");
        System.out.print("Enter the 1st positive integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the 2nd positive integer: ");
        int number2 = scanner.nextInt();

        while(number2 != 0){
            int temp = number2;

            number2 = number1 % number2;
            number1 = temp;
        }

        System.out.println("The GCD of the entered numbers is " + number1);

    }
}
