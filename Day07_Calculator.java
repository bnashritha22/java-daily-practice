import java.util.Scanner;

public class Day07_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid operator");
        }

        input.close();
    }
}
