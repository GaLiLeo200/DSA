import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Person is Adult");
        } else {
            System.out.println("Person is Not Adult");
        }

        sc.close();
    }
}