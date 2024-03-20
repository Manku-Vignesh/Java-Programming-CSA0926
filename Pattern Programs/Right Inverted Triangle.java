import java.util.Scanner;
public class ajay{
  public static void main(String[] args){
    Scanner koti = new Scanner(System.in);
    System.out.print("Enter the No.of Rows = ");
    int rows=koti.nextInt();
    for(int i=0; i<rows; i++){
      for(int j=0; j<i; j++){
          //this loop is to print spaces 
        System.out.print(" ");
      }
      // this loop is to print stars
      for(int j=rows; j>i; j--){
          System.out.print("*");
      }
      System.out.println();
  }
}
}

/*Comment starts
Enter the No.of Rows = 5
*****
 ****
  ***
   **
    *
Comment Ends*/
