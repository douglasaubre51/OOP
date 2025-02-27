package templars.abstergo.helix;

class a {

    a() {
        System.out.println("CALLING a");
    }
}

class b extends a {

    b() {
        System.out.println("CALLING b");
    }
}

class c extends b {

    c() {
        System.out.println("CALLING c");
    }
}

public class calling {

    public static void main(String[] args) {
        c cc = new c();
        System.out.println(cc);
    }
}
