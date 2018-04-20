import java.util.Scanner;

public class Rocket {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String s=sc.nextLine();
        while(!sc.hasNextInt()){
            System.out.println("invalid input, try to enter numbers");
            sc.nextLine();
        }
        System.out.println("Enter age");
        int a=sc.nextInt();
        System.out.println("Enter weight");
        int w=sc.nextInt();
        Human mark=new Human(s,a,w);
        mark.getInfo();
    }
}
