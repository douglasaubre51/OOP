package templars.abstergo.helix;

public class hehe {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            int a = 1;
            System.out.println("a is " + a);
            int b = 42 / a;
            //int c[] = new int[100];
            int c[] = {1};
            c[101] = 99;
        } catch (ArithmeticException e) {
            System.err.println("div by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("hello : ");
        }
        System.out.println("after");
    }
}
