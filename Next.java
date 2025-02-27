public class Next {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + b);
            try {
                if (a == 1)
                    a = a / (a - a);
                if (a == 2) {
                    int c[] = { 1 };
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("OOB\n... " + e);
            }
        } catch (ArithmeticException e) {
            System.out.printf("div by 0\n... {0}", e);
        }
    }
}
