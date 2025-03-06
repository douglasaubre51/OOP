//hello shibin
public class ChainExcDemo {
    static void demoproc() {
        ArithmeticException e = new ArithmeticException("div by zero");
        e.initCause(new ArithmeticException("user error"));
        throw e;

    }

    public static void main(String[] args) {
        try{
            demoproc();

        } catch (ArithmeticException e) {
            System.out.println("caught e :-" + e);
            System.out.println("original cause :-"+e.getCause());
        }
    }
}
