import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}