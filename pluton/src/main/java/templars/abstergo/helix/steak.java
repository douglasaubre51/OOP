package templars.abstergo.helix;
class stack
{
    int st[] = new int[20];
    int tos;
    stack()
    {
        tos=-1;
    }
    void push(int i)
    {
        if(i>10)
        {
            System.out.println("OVERFLOW");
        }
        else
        {
            st[++tos] = i;
        }
    }
    int pop()
    {
        if(tos<1)
        {
            System.out.println("UNDERFLOW");
            return 0;
        }
        else
        {
            return st[--tos];
            
        }
    }
}
public class steak 
{
    public static void main(String[] args)
    {
        stack w = new stack();
        int i;
        for(i=0;i<10;i++) w.push(i);
        for(i=0;i<10;i++)System.out.println(w.pop());
    }
}
