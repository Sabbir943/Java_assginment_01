import java.util.Scanner;

/**
 * strinfdatatype
 */
public class strinfdatatype {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name=input.nextLine();

        System.out.println("Name : "+name);
    }
}