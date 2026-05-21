
import java.util.Scanner;
public class NaArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        String[] names = new String[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter name "+(i+1)+":");
            names[i] = sc.next();
        }
        System.out.println("The names in the array are:");
        for(int i=0;i<n;i++){
            System.out.println(names[i]);
        };
        sc.close();
    };
};

