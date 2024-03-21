import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner rk=new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num=rk.nextInt();
        if(num%2==0){
            System.out.println(+num+ " is a Even Number");
        }
        else{
            System.out.println(+num+ " is a Odd Number");

        }
    }
}

/*COMMENT STARTS
  OUTPUT
  Enter the number = 5
  5 is a odd number
  COMMENT ENDS*/
