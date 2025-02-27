package templars.abstergo.helix;

class oden {

    void display() {
        System.out.println("CALLING oden");
    }
}

class tori extends oden {

    int mono;

    tori(int a) {
        mono = a;
    }

    @Override
    void display() {
        super.display();
        System.out.println("CALLING tori " + mono);
    }
}

public class jugo {

    public static void main(String[] args) {
        tori tt = new tori(3);
        tt.display();

    }
}
