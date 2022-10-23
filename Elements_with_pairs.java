import java.util.Scanner;
class Ele
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
        
        if(n%2!=0)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(x[j]+" "); 
            }
            System.out.print(0);
        }
        else
        {
          for(int j=0;j<n;j++)
            {
               System.out.print(x[j]+" "); 
            }  
        }
    }
}