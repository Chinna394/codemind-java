import java.util.Scanner;
class Count
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
        int n,x[],i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(ispall(x[i]))
            {
                c++;
            }
        }
        
         System.out.print(c);
        
    }
}