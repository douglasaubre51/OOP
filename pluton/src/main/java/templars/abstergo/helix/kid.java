package templars.abstergo.helix;

public class kid {

    static void k() {
        try {
            int t = 1;
            int e = 42;
            System.out.println("java says : -");
            double k = e / t;
            System.out.println("java says : -");
            System.out.println(k);
        } catch (ArithmeticException w) {
            System.out.println("Div by zero");
        }
        System.out.println("in method k");
    }

    public static void main(String[] args) {
        k();
        System.out.println("in main");
    }
}
