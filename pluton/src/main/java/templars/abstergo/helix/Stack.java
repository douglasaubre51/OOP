package templars.abstergo.helix;

class fstack implements IntStack {

    private final int stk[];
    private int tos;

    fstack(int a) {
        stk = new int[a];
        tos = -1;
    }

    @Override
    public void push(int a) {
        if (tos == stk.length - 1) {
            System.out.println("Stack Overflows");
        } else {
            stk[++tos] = a;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflows");
            return 0;
        } else {
            return stk[tos--];
        }
    }
}

public class Stack {

    public static void main(String[] args) {

        fstack ff = new fstack(10);
        for (int i = 0; i < 10; i++) {
            ff.push(i);
        }
        for (int i = 0; i < 10; i++) {
            ff.pop();
        }

    }

}
