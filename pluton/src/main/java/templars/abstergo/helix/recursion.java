package templars.abstergo.helix;
class recu
{
    int i=1;
    int recse(int d)
    {
        if (d==1) return 1;
        i=recse(d-1)*d;
        return i;
    }
}
public class recursion 
{
    public static void main(String[] args)
    {
        recu d = new recu();
        recu e = new recu();
        recu s = new recu();
        int ff=d.recse(1);
        int gg=e.recse(4);
        int zz=s.recse(5);
        System.out.println("java says :-");
        System.out.println("1 fac = "+ff);
        System.out.println("4 fac = "+gg);
        System.out.println("5 fac = "+zz);
    }
}
