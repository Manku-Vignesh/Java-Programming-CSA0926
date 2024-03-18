import java.util.Scanner;
import java.lang.Math;

public class squareroot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        double number = sc.nextDouble();
        double sqrt = Math.sqrt(number);
        System.out.println("Square root of "+number+ " is "+sqrt);
        sc.close();
    }
}
