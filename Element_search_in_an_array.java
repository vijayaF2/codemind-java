import java.util.Scanner;
public class Element{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] integerArray=new int[n];
        for(int i=0; i<n; i++)
        {
            integerArray[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int c=0;
        for(int i=0; i<n; i++)
        {
            if(integerArray[i]==s)
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