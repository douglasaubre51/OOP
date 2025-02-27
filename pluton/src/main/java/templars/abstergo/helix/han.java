package templars.abstergo.helix;
class his
{
    char fall;
    his(char a)
    {
        fall = a;
    }
    void printx(int d)
    {
        if(d==26) return;
        else printx(d+1);
        System.out.println(fall++);
    }
}
public class han 
{
    public static void main(String[] args)
    {
        his df = new his('a');
        df.printx(0);
    }
}
