package templars.abstergo.helix;
class ser
{
    int levi;
    ser(int a)
    {
        levi=a;
    }
    ser se()
    {
        ser a=new ser(levi+10);
        return a;
    }
}
public class once 
{
    public static void main(String[] args) 
    {
        ser af=new ser(10);
        ser fa=af.se();
        System.err.println(af.levi);
        System.out.println(fa.levi);
        fa=fa.se();
        af=fa.se();
        System.out.println(fa.levi);
        System.err.println(af.levi);

    }    
}
