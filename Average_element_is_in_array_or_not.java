import java.util.Scanner;
public class Average{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
        }
        int average=sum/n;
        int c=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==average)
            {
                c+=1;
            }
        }
        if(c==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}