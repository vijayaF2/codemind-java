import java.util.Scanner;
public class Area{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        int r=sc.nextInt();
        double area=pi*r*r;
        System.out.printf("%.2f",area);
    }
}