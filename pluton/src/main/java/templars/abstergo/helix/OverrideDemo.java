package templars.abstergo.helix;

import java.util.Scanner;

class Rectangle {
    int l, b;

    Rectangle(int x, int y) {
        l = x;
        b = y;
    }

    void Area() {
        System.out.println("area of a rectangle:" + l * b);
    }

    void Area(int a) {
        System.out.println("area of square:" + a * a);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Try programiz.pro");
        System.out.println("enter two nos: ");
        int l = scanner.nextInt();
        int b = scanner.nextInt();

        Rectangle rectangle = new Rectangle(l, b);
        rectangle.Area();
        rectangle.Area(l);

        scanner.close();
        System.out.println("bye");
    }
}