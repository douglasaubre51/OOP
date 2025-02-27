package templars.abstergo.helix;

class yuno {

    void drek() {
        System.out.println("CALLING yuno");
    }
}

class himeno extends yuno {

    @Override
    void drek() {

        System.out.println("CALLING himeno");
    }
}

public class hiori {

    public static void main(String[] args) {
        himeno y = new himeno();
        y.drek();
        yuno h;
        h = y;
        h.drek();

    }
}
