import java.util.*;
class code
{
    public static boolean isprime(int m)
    {
        if(m<2)
        {
            return false;
        }
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(m);i++)
        {
            if(m%i==0)
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],p=0,d=0;
        float aveg;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isprime(x[i]))
            {
                p=p+x[i];
                d++;
            }
             
        }
        aveg=(float)p/d;
        System.out.printf("%.2f",aveg);
        
    }
    
}