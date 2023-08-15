import java.util.*;
public class Area{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double s=(a+b+c)/2;
        double result=(s*(s-a)*(s-b)*(s-c));
        double output=Math.sqrt(result);
        System.out.printf("%.2f",output);
        
    }
}