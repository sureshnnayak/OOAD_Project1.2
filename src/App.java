
import java.util.Scanner; 

public class App {
    //can 2 class have main function? or how the entry point for the program is decided?
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("Hello, World!"); // does not inser a new line 
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        int length = myObj.nextInt(); 
    }
}
