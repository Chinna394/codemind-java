import java.util.Scanner;
class Cou
{
    public static int Add(int u)
    {
        int r,t=0,y=0;
        if(u==0)
        {
          t=1;  
        }
        if(u>0)
        {
            while(u>0)
            {
                r=u%10;
                t++;
                u=u/10;
            }
            return t;
        }
        else
        {
            u=Math.abs(u);
            while(u>0)
            {
               r=u%10;
                t++;
                u=u/10; 
            }
            return t;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],d;
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