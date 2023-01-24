
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompt the user for two numbers
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        // Calculate the product of the two numbers
        int product = firstNumber * secondNumber;
        // Print the operation and the product to the console
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
    }
}
