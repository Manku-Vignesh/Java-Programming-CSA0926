import java.util.Scanner;
public class Users{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Total No.of users = ");
        int total_users= sc.nextInt();
        System.out.println("Total No.of Staff = ");
        int staff_users= sc.nextInt();
        int non_staff=(staff_users/3);
        int total = total_users-(staff_users+non_staff);
        System.out.println("Student Uses = " +total);
        sc.close();
    }       
}


