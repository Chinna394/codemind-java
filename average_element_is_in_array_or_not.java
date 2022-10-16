import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,a=0,d;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            a=a+x[i];
        }
        d=a/n;
        for(i=0;i<n;i++)
        {
           if(x[i]==d)
           {
               System.out.println("True");
               System.exit(0);
           }
        }
        System.out.println("False");
    }
}