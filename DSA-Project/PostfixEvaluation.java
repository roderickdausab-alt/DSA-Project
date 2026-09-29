import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {

    public static void push(Stack<Integer> stack, int value) {
        stack.push(value);
    }

    public static int pop(Stack<Integer> stack) {
        return stack.pop();
    }

    public static int peek(Stack<Integer> stack) {
        return stack.peek();
    }

    public static void displayStack(Stack<Integer> stack) {
        System.out.println("Stack: " + stack);
    }

    public static int evaluatePostfix(String expression) {

        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be empty.");
        }

        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {

            if (token.matches("-?\\d+")) {

                int number = Integer.parseInt(token);

                push(stack, number);

                System.out.println("\nRead number: " + number);
                System.out.println("push(" + number + ")");
                System.out.println("peek() = " + peek(stack));
                displayStack(stack);

            } else {

                if (stack.size() < 2) {
                    throw new IllegalArgumentException(
                            "Invalid expression: insufficient operands."
                    );
                }

                int operand2 = pop(stack);
                int operand1 = pop(stack);

                int result;

                switch (token) {

                    case "+":
                        result = operand1 + operand2;
                        break;

                    case "-":
                        result = operand1 - operand2;
                        break;

                    case "*":
                    case "×":
                        result = operand1 * operand2;
                        break;

                    case "/":
                    case "÷":
                        if (operand2 == 0) {
                            throw new ArithmeticException(
                                    "Cannot divide by zero."
                            );
                        }
                        result = operand1 / operand2;
                        break;

                    default:
                        throw new IllegalArgumentException(
                                "Invalid operator: " + token
                        );
                }

                System.out.println("\nOperator: " + token);
                System.out.println("pop() = " + operand2);
                System.out.println("pop() = " + operand1);

                System.out.println(
                        operand1 + " " + token + " "
                        + operand2 + " = " + result
                );

                push(stack, result);

                System.out.println("push(" + result + ")");
                System.out.println("peek() = " + peek(stack));
                displayStack(stack);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException(
                    "Invalid expression: too many operands."
            );
        }

        return peek(stack);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter postfix expression: ");
        String expression = input.nextLine();

        try {
            int result = evaluatePostfix(expression);
            System.out.println("\nFinal Result: " + result);

        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }

        input.close();
    }
}