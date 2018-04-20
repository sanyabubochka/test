import java.util.Scanner;

public class Checking
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter text: ");
        String s=scanner.nextLine();
        s.charAt(1);
        boolean isPolindrome=true;
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)==s.charAt(s.length()-i-1))
            {
                isPolindrome=false;
            }
            System.out.println("isPolindrome"+isPolindrome);
        }
    }
}
