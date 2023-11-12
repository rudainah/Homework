/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Convert from Decimal to Binary \n");
        System.out.print("Enter an integer: ");
        int decimal_number = scanner.nextInt();

        if(decimal_number == 0){
            System.out.println("Binary representation: 0");
        }else {
            System.out.println("Binary representation: ");
            int reversed_binary = 0;
            int power_of_two = 1;

            while (decimal_number > 0) {
                int bit = decimal_number % 2;
                reversed_binary =reversed_binary + bit * power_of_two;

                decimal_number /= 2;
                power_of_two *= 10;                
            }
            System.out.println(reversed_binary);
        }
    }
}
