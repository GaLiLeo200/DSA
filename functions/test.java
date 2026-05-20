import java.util.Scanner;
class Sum {
    int a;
    int b;
    public int  sum(int x, int y){
        a=x;
        b=y;
        int sum=a+b;
        System.out.println("The sum is: "+sum);
        return sum;
    };
    public int  mult(int x, int y){
        a=x;
        b=y;
        int multiply=a*b;
        System.out.println("The product is: "+multiply);
        return multiply;
    };
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial is: "+fact);
        return fact;
    };
    public int average(int x, int y,int z){
        int avg=(x+y+z)/3;
        System.out.println("The average is: "+avg);
        return avg;
    }
    public int sumodd(int r){
        int sum=0;
        for (int i=0;i<=r;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }        System.out.println("The sum of odd numbers is: "+sum);
        return sum;
    }
    public void greaternum(int x, int y){
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else if(y>x){
            System.out.println(y+" is greater than "+x);
        }
        else{
            System.out.println("Both numbers are equal.");
        }
    }
    public double circumference(double r){
        double c=2*3.14*r;
        System.out.println("The circumference of the circle is: "+c);
        return c;

    };
    public void AgeEligible(int age){
        if(age>=18){
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }; 
    public void infinitel(){
        do { 
            System.out.println("This is an infinite loop.");
        } while (true);
    }
    public void countPNZ(Scanner sc) {
    int positive = 0;
    int negative = 0;
    int zero = 0;

    while (true) {
        System.out.print("Enter an integer or q to stop: ");

        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        } else {
            String input = sc.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer or q.");
            }
        }
    }

    System.out.println("Positive numbers: " + positive);
    System.out.println("Negative numbers: " + negative);
    System.out.println("Zeroes: " + zero);
}
};
    public class test{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
             Sum s=new Sum();
            System.out.print("Enter the first number: ");
            int num1=sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2=sc.nextInt();
            System.out.print("Enter the third number: ");
            int num3=sc.nextInt();
            System.out.print("Enter the factorial number: ");
            int n=sc.nextInt();
            s.sum(num1, num2);
            s.mult(num1, num2);
            s.factorial(n);
            s.average(num1, num2, num3);
            System.out.print("Enter the range odd numbers: ");
            int oddRange=sc.nextInt();
            s.sumodd(oddRange);
            System.out.print("Enter the first number: ");
            int greaterNum1=sc.nextInt();
            System.out.print("Enter the second number: ");
            int greaterNum2=sc.nextInt();
            s.greaternum(greaterNum1, greaterNum2);
            System.out.print("Enter the radius of the circle: ");
            double radius=sc.nextDouble();
            s.circumference(radius);
            System.out.print("Enter your age: ");
            int age=sc.nextInt();
            s.AgeEligible(age);
            s.infinitel();
            
            System.out.print("Enter the number of integers: ");
            int count=sc.nextInt();
            s.countPNZ(sc);
        };
    
};
