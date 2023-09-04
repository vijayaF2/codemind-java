import java.util.Scanner;
public class Divisors{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l,r,k;
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        int c=0;
        for(int i=l; i<=r; i++)
        {
            if(i%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}