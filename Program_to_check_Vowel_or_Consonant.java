import java.util.Scanner;
public class VowelConsonant{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s;
        s=sc.next().charAt(0);
        if(s=='A' || s=='E' || s=='I' || s=='O' || s=='U' || s=='a' || s=='e' || s=='i' || s=='o' || s=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}