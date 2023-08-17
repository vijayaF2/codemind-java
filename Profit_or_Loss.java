import java.util.Scanner;
public class ProfitLoss{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cp,sp;
        cp=sc.nextInt();
        sp=sc.nextInt();
        if(cp>sp)
        {
            System.out.println("Loss");
        }
        else if(cp<sp)
        {
            System.out.println("Profit");
        }
        else
        {
            System.out.println("No profit and No loss");
        }
    }
}