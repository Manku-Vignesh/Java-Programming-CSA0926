import java.util.Scanner;
public class ajay{
  public static void main(String[] args){
    Scanner koti = new Scanner(System.in);
    System.out.print("Enter the No.of Rows = ");
    int rows=koti.nextInt();
    for(int i=0; i<rows; i++){
      for(int j=0; j<=i; j++){
        System.out.print("*");
      }
      System.out.println(" ");
  }
}
}


/* OUPUT 

Enter the No.of Rows = 5
* 
** 
*** 
**** 
***** 


Code Excuted Successfully 
*/
