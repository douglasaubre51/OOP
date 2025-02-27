package templars.abstergo.helix;
class p
{
    int af[];
    p(int i)
    {
        af=new int[i];
    }
    void print(int i)
    {
        if (i==0) return;
        else print(i-1);
        System.out.println("["+(i-1)+"] "+af[i-1]);
    }
}
public class prints 
{
    public static void main(String[] args)
    {
        p ff = new p(10);
        int i;
        for(i=0;i<10;i++) ff.af[i]=i;
        ff.print(10);
    }
}
