/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

import java.util.Scanner;

public class MiddleDigit {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a 5-digit integer: ");

        System.out.print("Enter a 5-digit integer: ");
        int number = scanner.nextInt();

        while(number > 0)
        {
            if(number < 10000 || number > 99999){
                System.err.println("Invalid input. ");
                System.out.print("Enter a 5-digit integer: ");
                number = scanner.nextInt();
            }else{
                break;
            }
            
        }
        int middle_digit = (number / 100) % 10;
        System.out.println("Middle digit of " + number + " is " + middle_digit);
    }
}
