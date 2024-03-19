import java.util.Scanner;
public class days{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int num= sc.nextInt();
        int years=(num/365);
        System.out.println("Years= " +years);
        int weeks=(num%365)/7;
        System.out.println("weeks= " +weeks);
        int days=(num%365)%7;
        System.out.println("days= " +days);
        sc.close();
    }       
}
