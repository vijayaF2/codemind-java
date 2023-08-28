import java.util.Scanner;
public class Absolute{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        int odd=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]%2==0)
            {
                sum+=a[i];
            }
            else
            {
                odd+=a[i];
            }
        }
        if(sum>odd)
        {
            System.out.println(sum-odd);
        }
        else
        {
            System.out.println(odd-sum);
        }
    }
}