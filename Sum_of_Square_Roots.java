import java.util.*;
public class Square{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        double sum=0;
        for(int i=A; i<=B; i++)
        {
            sum+=Math.sqrt(i);
        }
        System.out.printf("%.2f",sum);
        
    }
}