

public class n {
    static void nest(int a) {
        try {
            if (a == 1)
                a = a / (a - a);
            if (a == 2) {
                int c[] = { 1 };
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OOB\t" + e);
        }
    }

    public static void main(String[] args) {

        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a= " + a);
            nest(a);
        } catch (ArithmeticException e) {
            System.out.println("div by 0");
        }
    }
}
