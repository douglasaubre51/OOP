
package templars.abstergo.helix;

import java.util.Scanner;

class FactorialClass {

    public int GetFactorial(int n) {
        if (n == 1)
            return n;
        else
            return n * GetFactorial(n - 1);
    }
}

public class FactorialDemo {
    public static void main(String[] args) {

        FactorialClass factorialClass = new FactorialClass();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a no :");
        int num = scanner.nextInt();
        scanner.close();

        num = factorialClass.GetFactorial(num);
        System.out.println(factorialClass + "The factorial is : " + num);
    }
}
