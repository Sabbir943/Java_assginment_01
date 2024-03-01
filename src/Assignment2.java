/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price,
 *  description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */

import java.util.Scanner;

/**
 * Assignment2
 */
public class Assignment2 {

    public static void main(String[] args) {
        int id;
        String title,price,discription,category;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your id: ");
        id=input.nextInt();
        System.out.println("Enter the title: ");
        title=input.nextLine();
        System.out.print("Enter the price: ");
        price=input.nextLine();
        System.out.println("Write the discription: ");
        discription=input.nextLine();
        System.out.print("Tell me category: ");
        category=input.nextLine();
        
        System.out.println("Id :"+id);
        System.out.println("Title :"+title);
        System.out.println("Price: "+price);
        System.out.println("Description: "+discription);
        System.out.println("Category is :"+category);
        
    }
}
    

