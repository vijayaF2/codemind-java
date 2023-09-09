import java.util.Scanner;
public class Counting{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0; i<st.length(); i++)
        {
            if(st.charAt(i)==c)
            {
                count+=1;
            }
        }
        if(count==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(count);
        }
        
    }
}