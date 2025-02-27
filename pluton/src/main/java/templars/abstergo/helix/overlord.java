package templars.abstergo.helix;
class venti
{
    void v()
    {
        System.out.println("java says :-");
    }
    int v(int a)
    {
        return a*a;
    }
    void v(double g)
    {
        System.out.println(g);
    }
}
public class overlord 
{
    public static void main(String[] args)
    {
        venti sf = new venti();
        sf.v();
        int g=sf.v(10);
        sf.v(45.5);
        System.out.println("void(int a) :-\n"+g);
    }
}
