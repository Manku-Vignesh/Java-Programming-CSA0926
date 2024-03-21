import java.util.Scanner;
public class factorcount{
    public static void main(String [] args){
        Scanner rk = new Scanner(System.in);
            System.out.print("Enter the number = ");
            int num = rk.nextInt();
            int factorcount=0;
            for(int i=1; i<=num; i++){
                if(num % i ==0 ){
                    factorcount++;

                }
            }
            System.out.println("Total factors of " +num+" are: "+ factorcount);

    }
}

/*COMMENT STARTS
  OUTPUT
Enter the number = 10
Total factors of 10 are: 4

COMMENT ENDS*/
