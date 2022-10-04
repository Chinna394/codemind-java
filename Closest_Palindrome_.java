import java.util.Scanner;
class pali
{
    public static boolean ispall(int x)
    {
        int r,rev=0,t;
        t=x;
        while(x>0)
        {
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(t==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1,d2;
        n=sc.nextInt();
        for(int i=n-1;;i--)
        {
            if(ispall(i))
            {
                d1=i;
                break;
            }
        }
        
        for(int i=n+1;;i++)
        {
            if(ispall(i))
            {
                d2=i;
                break;
            }
        }
        
        if((n-d1)<(d2-n))
        {
            System.out.println(d1);
        }
        else if((n-d1)==(d2-n))
        {
            System.out.println(d1+" "+d2);
        }
        else
        {
            System.out.println(d2);
        }
    }
}