import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],s=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(x[i]%2 == 0)
            {
                s=s+x[i];
            }
            else break;
        }
        System.out.println(s);
    }
}