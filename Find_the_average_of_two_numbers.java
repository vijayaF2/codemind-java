import java.util.Scanner;
public class Average{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        double average=(n+m)/2;
        System.out.printf("%.4f",average);
    }
}