
import java.util.Scanner;
public class scann {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    System.out.print("Enter ID: ");
    int a = sc.nextInt(); 
    System.out.print("Enter salary: ");
    float f = sc.nextFloat();   
    sc.nextLine(); 
    System.out.print("Enter your name: ");
    String s = sc.nextLine(); 

    System.out.println("--------value---------");
    System.out.println("ID: " + a);
    System.out.println("Salary is: " + f);
    System.out.println("Your name: " + s);
       
    }
    
}
