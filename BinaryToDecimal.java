
/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Binary to Decimal \n");
        System.out.print("Enter a binary number: ");
        String binary = scanner.next();

        int decimal = Integer.parseInt(binary, 2);
        System.out.println("The decimal number will be: " + decimal);
    }
}
