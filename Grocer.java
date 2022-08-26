import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
        /* Task 1: Create an array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea

             Then, use a for loop to print each element in the array. 
        */

        String[] storeWarehouse = {"apples", "bananas","candy","chocolate", "coffee", "tea"};

        for (int i = 0; i < storeWarehouse.length; i++) {
            System.out.println(storeWarehouse[i]);
        }
 
        /* Task 2:
           1. System.out.println("\nDo you sell coffee?");

           2. Using the for loop from task 1:
            • check if Java Grocer sells coffee.
            • if so, break the loop and print: \nWe have that in aisle: <index>

        */
        System.out.println("\nDo you sell coffee?");
        for (int i = 0; i < storeWarehouse.length; i++) {
            if(storeWarehouse[i].equals("coffee")){
                System.out.println("\nWe have that in aisle: " + i);
                break;
            }

        }

        //another task

        Scanner scan = new Scanner(System.in);

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        //  Task 1: Set up Scanner, and pick up the user's response.
        String response = scan.nextLine(); 

        
        for (int i = 0; i < store.length; i++) {
          /* Task 2  
                if element equals user's response  {
                    println: \nWe have that in aisle:  <index>
                    break;
                }
          */
          if(store[i].equals(response)){
            System.out.println("\nWe have that in aisle: " + i);
            break;
          }
        }
    
    }
}
