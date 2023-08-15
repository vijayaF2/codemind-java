import java.util.Scanner;
public class Multiply{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Float a,b;
        a=sc.nextFloat();
        b=sc.nextFloat();
        Float c=a*b;
        System.out.printf("%.2f",c);
    }
}