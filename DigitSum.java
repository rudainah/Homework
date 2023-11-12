/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class DigitSum {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digit Sum \n");
        System.out.print("Enter a number ");
        int number = scanner.nextInt();

        if(number <= 0){
            System.err.println("Unvalid input");
        }else {
            while (number >= 10) {
                int sum = 0;
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                number = sum;
            }
            System.out.println("Result: " + number);
        }
    }
}
