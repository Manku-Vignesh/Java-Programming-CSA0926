import java.util.Scanner;
public class factors{
    public static void main(String[] args){
        Scanner rk = new Scanner(System.in);
            System.out.print("Enter the Number = ");
            int num=rk.nextInt();
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.println(i+" ");
                }
            }
        }
    }
