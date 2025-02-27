package templars.abstergo.helix;
class joy
{
    int jack;
    joy(int f)
    {
        jack=f;
    }
    joy by10()
    {
        joy j = new joy(jack+10);
        return j;
    }
}
public class returns 
{
    public static void main(String[] args) 
    {
        joy ss = new joy(4);
        joy ff= ss.by10();
        System.out.println(ss.jack);
        System.out.println(ff.jack);
    }
}
