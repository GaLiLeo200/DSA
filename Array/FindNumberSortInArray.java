import java.util.Scanner;
public class FindNumberSortInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted = true;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("The array is sorted in ascending order.");
        }
        else{
            System.out.println("The array is not sorted in ascending order.");
        }
        sc.close();
    }
    
}
