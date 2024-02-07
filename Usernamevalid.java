import java.util.*; 
import java.io.*; 
public class user 
{ 
 public static void main(String[] args) 
 { 
 
 String a,b; 
 Scanner sc=new Scanner(System.in); 
 System.out.println("Enter the username:"); 
 a=sc.next(); 
 System.out.println("Re Enter the username:"); 
 b=sc.next(); 
 if(a.equals(b)) 
 {
     System.out.println("Username is valid"); 
 } 
 else 
 { 
 System.out.println("Username is Invalid"); 
 } 
 
 } 
}
