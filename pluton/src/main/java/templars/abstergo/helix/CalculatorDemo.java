package templars.abstergo.helix;

import java.util.Scanner;

enum Calculator {
    adder, subtractor, multiplier, divider, remainder
}

class CalculatorClass {
    int num1;
    int num2;

    public CalculatorClass(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public int GetResult(String temp) {
        try {
            switch (Calculator.valueOf(temp)) {
                case adder:
                    return num1 + num2;
                case subtractor:
                    return num1 - num2;
                case multiplier:
                    return num1 * num2;
                case divider:
                    return num1 / num2;
                case remainder:
                    return num1 % num2;
                default:
                    return 0;
            }

        } catch (Exception e) {
            System.out.println("wrong action!");

            return 0;
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Supported Actions:\nenter {adder} for addition\nenter {subtractor} for subtraction\nenter {multiplier} for multiplication\nenter {divider} for division\nenter {remainder} for remainder");
        String action = scanner.nextLine();

        System.out.println("enter two nums :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        scanner.close();

        CalculatorClass calculatorClass = new CalculatorClass(num1, num2);
        int result = calculatorClass.GetResult(action);

        System.out.println("the result is : " + result);
        System.out.println("bye");
    }
}
