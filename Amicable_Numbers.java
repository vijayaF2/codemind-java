import java.util.Scanner;
public class Amicable{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int sum=0,count=0;
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            else
            {
                continue;
            }
        }
        for(int i=1; i<=m/2; i++)
        {
            if(m%i==0)
            {
                count+=i;
            }
            else
            {
                continue;
            }
        }
        if(n==count && m==sum)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}