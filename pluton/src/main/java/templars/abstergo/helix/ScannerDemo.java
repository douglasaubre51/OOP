package templars.abstergo.helix;

import java.util.Scanner;

interface SharedResource {
    Scanner scanner = new Scanner(System.in);
}

public class ScannerDemo implements SharedResource {
    public static void main(String[] args) {

        String inputString = scanner.next();
        System.out.println(inputString);

        System.out.println("scanner1");

        String inputString1 = scanner.next();
        System.out.println(inputString1);

        scanner.close();

    }

}
