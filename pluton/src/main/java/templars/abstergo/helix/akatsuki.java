package templars.abstergo.helix;

interface callback {

    void gett(int para);
    public int A = 22;
}

class foo implements callback {

    @Override
    public void gett(int a) {
        System.out.println("from interface " + a);

    }

    void sett() {
        System.out.println("java says hello");
    }

}

class foo2 implements callback {

    @Override
    public void gett(int e) {
        System.out.println("he he " + e);
    }
}

public class akatsuki {

    public static void main(String[] args) {
        foo ff = new foo();
        ff.gett(2);
        ff.sett();
        callback dd;
        dd = ff;
        dd.gett(6);
        callback zz = new foo();
        zz.gett(1);
        System.out.println(callback.A);
        zz.gett(5);
        callback cc = new foo2();
        cc.gett(10);

    }
}
