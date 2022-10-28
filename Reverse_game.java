import java.util.Scanner;
class Play
{
    public static int Add(int x)
    {
        int r,sum=0,t=x;
        while(x>0)
        {
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        return sum;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c=0,d,e=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
           d=Add(x[i]);
           System.out.print(d+" ");
        }
        
    }
}