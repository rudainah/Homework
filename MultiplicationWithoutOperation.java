import java.util.Scanner;

public class MultiplicationWithoutOperation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = scanner.nextInt();

        int result = 0;

        for(int i = 0; i < number1; i++){
            result = result + number2;
        }

        System.out.println("Result is: " + result);
    }
}
