import java.util.Scanner;
public class Divisible{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]%k==0)
            {
                count+=1;
            }
        }
        System.out.println(count);
    }
}