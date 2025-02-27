package templars.abstergo.helix;
//can't make bb.calls and bb.call,
//can print them just by creating object bb.
//can't make calls from super class a.
//outdated code i think just like tatsumaki
/*Exception in thread "main" java.lang.NoSuchMethodError: 
'void templars.abstergo.helix.A.calls()'
at templars.abstergo.helix.nami.main(nami.java:29) */

abstract class al {

    abstract void calls();

    void call() {
        System.out.println("CALLING from a");
    }
}

class ba extends al {

    @Override
    void calls() {
        System.out.println("CALLING from b");
    }
}

public class nami {

    public static void main(String[] args) {

        ba bb = new ba();
        al ss;
        bb.call();
        bb.calls();
        ss = bb;
        ss.call();
        ss.call();
        bb.call();
        bb.calls();

    }
}
