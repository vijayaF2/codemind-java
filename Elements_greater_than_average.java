import java.util.Scanner;
public class Average{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] integerArray=new int[n];
        for(int i=0; i<n; i++)
        {
            integerArray[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=integerArray[i];
        }
        int average=sum/n;
        int c=0;
        for(int i=0; i<n; i++)
        {
            if(integerArray[i]>=average)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}