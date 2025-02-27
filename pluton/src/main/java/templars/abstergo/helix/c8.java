package templars.abstergo.helix;

class dad {

    int cash = 10000;
    private final int prop = 1000000;

    void display1() {
        System.out.println("dad has $" + cash);
        System.out.println("dad has property $" + prop);
    }
}

class son extends dad {

    int g = cash + 20000;

    void display2() {
        System.out.println("Son has $" + g);
    }
}

public class c8 {

    public static void main(String[] args) {
        dad gg = new dad();
        son ff = new son();
        gg.display1();
        ff.display2();
    }
}
