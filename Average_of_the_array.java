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
        double sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=a[i];
        }
        double average=sum/n;
        System.out.printf("%.2f",average);
    }
}