package condition;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Taking input of the operator
            System.out.println("Enter the operator (+, -, *, /): ");
            System.out.println("For exiting the loop press (x or X)");
            char operator = sc.next().trim().charAt(0);

            // Exit condition
            if (operator == 'x' || operator == 'X') {
                break;
            }

            // Valid operator check
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                System.out.println("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int ans = 0; // Initialize ans

                if (operator == '+') {
                    ans = num1 + num2;
                } else if (operator == '-') {
                    ans = num1 - num2;
                } else if (operator == '*') {
                    ans = num1 * num2;
                } else if (operator == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; // Skip to next iteration
                    }
                }

                System.out.println("The result is: " + ans);
            } else {
                System.out.println("Error: Invalid operator. Please try again.");
            }
        }

        sc.close();
        System.out.println("Calculator exited.");
    }
}
