import java.util.Scanner;
public class Numbers{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n;
        String a=Integer.toString(n);
        String b=Integer.toString(s);
        if(b.endsWith(a))
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}