import java.util.Scanner;
public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the marks of " + n + " subjects:");

        int[] marks = new int[n];
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            System.out.println("Your marks[" + i + "]: " + marks[i]);
        }
    }
    
}
