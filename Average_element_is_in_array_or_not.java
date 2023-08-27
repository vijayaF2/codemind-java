import java.util.Scanner;
public class Average{
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
        for(int i=0; i<n; i++)
        {
            sum+=a[i];
        }
        int average=sum/n;
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]==average)
            {
                count+=1;
            }
        }
        if(count==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}