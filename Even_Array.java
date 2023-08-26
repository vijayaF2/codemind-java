import java.util.Scanner;
public class Even{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] integerArray=new int[n];
        for(int i=0; i<n; i++)
        {
            integerArray[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0; i<n; i++)
        {
            if(integerArray[i]%2==0)
            {
                c+=1;
            }
        }
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}