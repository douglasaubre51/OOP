package templars.abstergo.helix;
class caesar
{
    int arr[];
    caesar(int s)
    {
        arr = new int[s];
    }
    void pri(int t)
    {
        if(t==0) return;
        else pri(t-1);
        System.out.println("["+(t-1)+"] "+arr[t-1]);
        System.out.println("hello there");
    }
}
public class joker 
{
    public static void main(String[] args)
    {
        int d;
        caesar hh = new caesar(11);
        for(d=0;d<11;d++) hh.arr[d]=d+2;
        hh.pri(11);
    }

}
