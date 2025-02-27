package templars.abstergo.helix;

import java.util.Scanner;

class ConcatenateClass1 {

    String word1;
    String word2;

    public ConcatenateClass1(String a, String b) {
        word1 = a;
        word2 = b;
    }

    public String GetConcatenatedString() {
        return word1 + " " + word2;
    }
}

public class ConcatenateDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word 1:");
        String word1 = scanner.nextLine();

        System.out.println("Enter word 2:");
        String word2 = scanner.nextLine();

        scanner.close();

        ConcatenateClass1 concatenateClass = new ConcatenateClass1(word1, word2);

        String result = concatenateClass.GetConcatenatedString();
        System.out.println("Result : " + result);

    }
}
