package templars.abstergo.helix;
class afo
{
    int garp;
    afo(int g)
    {
        garp=g;
    }
    afo fall()
    {
        afo q = new afo(garp+10);
        return q;
    }
}
public class again 
{
    public static void main(String[] args)
    {
        afo sd = new afo(6);
        afo ss = sd.fall();
        System.out.println(sd.garp);
        System.out.println(ss.garp);
    }
}
