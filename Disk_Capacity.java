import java.util.Scanner;
public class Capacity{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        int capacity=(2*t*s*b*512);
        System.out.print(capacity);
    }
}