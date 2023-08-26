import java.util.Scanner;
public class Celsius{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double f=(n*1.8)+32;
        System.out.printf("%.2f",f);
    }
}