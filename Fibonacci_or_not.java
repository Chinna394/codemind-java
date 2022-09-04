import java.util.Scanner;
class Code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,n,res=0;
        n=sc.nextInt();
        c=a+b;
        while(c<=n)
        {
            if(c==n)
            {
                res=1;
                break;
            }
            a=b;
            b=c;
            c=a+b;
            
        }
        if(res==1)
        {
            System.out.println("True");
        }
        else
        {
          System.out.println("False");  
        }
        
    }
}