import java.util.Scanner;
class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(x[j]%2==0)
            {
                System.out.print(x[j]+" ");
            }
        }
        for(int j=0;j<n;j++)
        {
            if(x[j]%2!=0)
            {
                System.out.print(x[j]+" ");
            }
        }
    }
}