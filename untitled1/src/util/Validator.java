package util;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Validator {
    public static int getNumber(int min, int max)
    {
        Scanner sc= new Scanner(System.in);
        String input;
        System.out.println("Choose your option : ");
        int answer=0;
        while(true)
        {
            input =sc.nextLine();
            if (input.matches(s: "\\d+")) {
                if(Integer.parseInt(input)>=min || Integer.parseInt(input)<=max )
                    return Integer.parseInt(input);
        }
            System.out.println("invalid input, please, try again ");
        }

    }

}
