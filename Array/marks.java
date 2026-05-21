import java.util.Scanner;
public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 subjects:");
        int[] marks = new int[3];
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    
}
