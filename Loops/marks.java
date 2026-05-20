package Loops;

import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        while (true) {
            System.out.print("Enter 1 to input marks or 0 to exit: ");
            int choice;

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter only 0 or 1.");
                sc.next();
                continue;
            }

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else if (choice == 1) {
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("Good marks");
                } else if (marks > 60 && marks < 90) {
                    System.out.println("Average");
                }
            } else {
                System.out.println("Invalid choice. Please enter only 0 or 1.");
            }
        }

        sc.close();
    }
}
