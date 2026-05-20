
import java.util.Scanner;
public class printname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        printname(name);
    }
    public static void printname(String name){
        System.out.println("Your name is: "+name);
    }
}
