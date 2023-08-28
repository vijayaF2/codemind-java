import java.util.Scanner;
public class Difference{
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
        int diff=0;
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                sum+=a[i];
            }
            else
            {
                diff+=a[i];
            }
        }
        int count=sum-diff;
        System.out.println(count);
    }
}