import java.util.Scanner;
public class Positive{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}