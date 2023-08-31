import java.util.Scanner;
public class Elements{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        int z=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(a[i]==z)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}