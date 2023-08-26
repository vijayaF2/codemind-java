import java.util.Scanner;
public class Celsius{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double c=((n-32)*5/9);
        System.out.printf("%.2f",c);
    }
}