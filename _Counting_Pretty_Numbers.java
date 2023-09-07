import java.util.Scanner;
public class Pretty{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1; i<=t; i++)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int a=2;
            int b=3;
            int c=9;
            int count=0;
            String d=Integer.toString(a);
            String e=Integer.toString(b);
            String f=Integer.toString(c);
            for(int j=l; j<=r; j++)
            {
            String s=Integer.toString(j);
            if(s.endsWith(d) || s.endsWith(e) || s.endsWith(f))
              {
                count+=1;
              }
            }
            System.out.println(count);
        }
        }
    }