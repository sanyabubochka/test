import java.util.Scanner;
public class Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pl = sc.nextLine();
        String lp=new String();
        for (int i = 0; i <pl.length()/2; i++) {

        }
        if(pl.equals(lp)){System.out.println("palindrom");}
        else{
            System.out.println("not palindrom");}
    }


}
