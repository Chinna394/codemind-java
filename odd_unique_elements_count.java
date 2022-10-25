import java.util.Scanner;
class Odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c,i,j,d=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
            if(x[i]!=999)
            {
                c=1;
                for(j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        c++;
                        x[j]=999;
                    }
                }
                
                if(x[i]%2!=0)
               {
                  d++;
                  
                }
            }
            
            
        }
        System.out.println(d);
        
    }
}