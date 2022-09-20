import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String id,name;
        int n;
        double bill;
        id=sc.nextLine();
        name=sc.nextLine();
        n=sc.nextInt();
        if(n>0 && n<200)
        {
            bill=n*1.2;
        }
        else if(n>=200 && n<400)
        {
            bill=(n*1.5);
        }
        else if(n>=400 && n<600)
        {
            bill=(n*1.8);
        }
        else
        {
            bill=(n*2);
        }
        
        if(bill>400)
        {
            System.out.printf("%.2f",(bill+(bill*0.15)));
        }
        else
        {
            System.out.printf("%.2f",(bill+100));
        }
    }
}