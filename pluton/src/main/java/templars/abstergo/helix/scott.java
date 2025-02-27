package templars.abstergo.helix;

import java.util.Random;

public class scott {

    public static void main(String[] args) {
        Random r = new Random();
        int a, b, c;
        for (int i = 0; i < 10; i++) {
            try {
                a = r.nextInt();
                b = r.nextInt();
                c = (12345 / (a / b)) % 100;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("div by zero " + e);
            }

        }

    }
}
