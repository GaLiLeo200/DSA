import java.util.Scanner;
public class Choiceswitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Hello");
        System.out.println("2. Hi");
        System.out.println("3. Hey");
        System.out.println("Enter your choice:");
        int Choice=sc.nextInt();
        switch(Choice){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hi");   
                break;
            case 3:
                System.out.println("Hey");  
                break;
            default:
                System.out.println("Invalid choice");   

        };

    };
    
};
