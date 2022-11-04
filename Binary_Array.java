import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,d=0,e=0,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            if(x[i]==0)
            {
               c++; 
            }
            else if(x[i]==1)
            {
                d++;
            }
            else
            {
                e++;
            }
        }
        if(n==(c+d))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}