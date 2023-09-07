import java.util.Scanner;
public class Monoploy{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            int R1=sc.nextInt();
            int R2=sc.nextInt();
            int R3=sc.nextInt();
            if((R1+R2)<R3 || (R2+R3)<R1 || (R3+R1)<R2)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}