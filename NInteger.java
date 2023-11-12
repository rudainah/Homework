/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

import java.util.Scanner;

public class NInteger {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.print("N Integer => N + NN + NNN \n");
        System.out.print("Enter any integer number: ");
        int number = scanner.nextInt();

        System.out.println("REsult is " + number + " + " +  number + number + " + " + number + number + number);

    }
}
