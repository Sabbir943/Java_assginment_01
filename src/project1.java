
import java.util.Scanner;
public class project1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        
        
        System.out.print("Enter Your Title :");
        String title=input.nextLine();
        
        System.out.print("Enter Your Description :");
       String description=input.nextLine();
        
        System.out.print("Enter Your Catagory :");
         String catagory=input.nextLine();
        
         System.out.print("Enter your Id :");
        int id=input.nextInt();
        
        System.out.print("Enter  your Price :");
       int price=input.nextInt();
       
        System.out.println(); 
        
        
        System.out.println("My Title :"+title);
        System.out.println("Phone Description :"+description);
        System.out.println("Catagory :"+catagory);
        System.out.println("Phone ID :"+id);
        System.out.println("Phone Price :"+price);
    } 
}