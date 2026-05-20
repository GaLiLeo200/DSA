import java.util.Scanner;
public class calculator {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("Enter your choice:");
        int Choice=sc.nextInt();
        switch(Choice){
            case 1: 
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2)); 
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2)); 
                break;
            case 4:
                if(num2 != 0){
                    System.out.println("Result: " + (num1 / num2)); 
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if(num2 != 0){
                    System.out.println("Result: " + (num1 % num2));
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice");
        };
        sc.close();
        };
    };

