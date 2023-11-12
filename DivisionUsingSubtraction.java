/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

import java.util.Scanner;

public class DivisionUsingSubtraction {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Division Using Subtraction \n");
        System.out.print("Enter the divided: ");
        int divided = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if(divisor == 0){
            System.out.println();
        }else {
            int result = 0;

            while (divided >= divisor) {
                divided -= divisor;

                result++;
            }
            System.out.println("Result of division is " + result);
        }
    }
}
