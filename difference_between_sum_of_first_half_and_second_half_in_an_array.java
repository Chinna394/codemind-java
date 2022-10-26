import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],a=0,b=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        for(int j=0;j<n/2;j++)
        {
            a=a+x[j];
        }
        
        
        for(int j=(n/2);j<n;j++)
        {
            b=b+x[j];
        }
        System.out.println(Math.abs(a-b));
    }
}