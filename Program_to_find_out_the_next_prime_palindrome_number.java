import java.util.Scanner;
class Pri
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
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
        int n;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(isprime(i) && ispall(i))
            {
                System.out.println(i+"");
                break;
            }
        }
    }
}