import java.util.Scanner;

public class AddBinaryNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add Binary Numbers \n");
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.next();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.next();

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);
        int sum = decimal1 + decimal2;
        String sum_in_binary = Integer.toBinaryString(sum);

        System.out.println("The sum of the givin binary numbers is: " + sum_in_binary);
    }
}
