import java.util.Scanner;
class Mix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int r,c=0,d=0,m=0;
        while(n>0)
        {
            r=n%10;
            m++;
            if(n%2==0)
            {
                c++;
            }
            else
            {
               d++; 
            }
            n=n/10;
        }
        if(m==c)
        {
            System.out.println("Even");
        }
        else if(m==d)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
        
    }
}