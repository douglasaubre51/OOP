package templars.abstergo.helix;

class mha {

    int stud;

}

class h extends mha {

    int stud1;

    h(int a, int f) {
        super.stud = a;//basically this.stud of superclass but inside subclass
        stud1 = f;
    }

    void dis1() {
        System.out.println("mha says :- " + super.stud);
        System.out.println("h says :- " + stud1);
    }
}

public class deku {

    public static void main(String[] args) {
        h u = new h(22, 11);
        u.dis1();

    }
}
