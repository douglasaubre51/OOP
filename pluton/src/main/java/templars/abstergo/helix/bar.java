package templars.abstergo.helix;

class foo4 implements IntStack {

    int Stk[];
    int top;

    foo4(int array_size) {
        Stk = new int[array_size];
        top = -1;
    }

    @Override
    public void push(int a) {
        if (top == Stk.length - 1) {
            System.out.println("Doubling array size");
            Stk = new int[top * 2];

        } else {
            Stk[++top] = a;

        }
    }

    @Override
    public int pop() {
        if (top < 0) {
            System.out.println("Underflow");
            return 0;
        } else {
            top--;
            return 0;
        }
    }
}

public class bar {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        foo4 ff = new foo4(10);
        IntStack ii;
        fstack FF = new fstack(10);
        ii = FF;
        for (int i = 0; i < 200; i++) {
            FF.push(i);
            // System.out.println(ff.Stk[ff.top]);

        }
        for (int i = 0; i < 50; i++) {
            FF.pop();
        }
    }
}
