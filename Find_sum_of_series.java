import java.util.Scanner;
class Series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        float sum;
        n=sc.nextInt();
        sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+((float)1/i);
        }
        System.out.printf("%.2f",sum);
        sc.close();
    }
}