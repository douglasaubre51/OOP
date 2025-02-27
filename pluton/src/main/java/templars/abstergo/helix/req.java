package templars.abstergo.helix;

abstract class histeria {

    abstract void call();

    void calls() {
        System.out.println("clang");
    }
}

class heel extends histeria {

    @Override
    void call() {
        System.out.println("conman");
    }
}

public class req {

    public static void main(String[] args) {
        heel hh = new heel();
        hh.calls();
        hh.call();
        histeria d;
        d = hh;
        d.call();
    }
}
