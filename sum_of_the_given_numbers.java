import java.util.Scanner;
public class Numbers{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x+y;
            System.out.println(z);
        }
    }
}