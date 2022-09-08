import java.util.Scanner; 
import java.util.Arrays;
import java.util.*;

public class textParser {
    public static void main(String[] args) {
        Processor p = new Processor();
        String str = p.read();
        while(!str.isEmpty()){
            
            str = p.clean(str);
            str = p.sort(str);
            str = p.palindrome(str);
            p.print(str);
            str = p.read();
        }
    }   

}

class Processor{
    public String read(){
        // creating a scanner object
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the string:");
        String str = scan.nextLine();
        return str;
    }

    public String clean(String txt){
        //reff: https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/
        //converting all charecters to uppre case 
        String str = txt.toUpperCase();
        //replacing space 
        str = str.replaceAll("\\s", "");
        return str;
        

    }
    public String sort(String str){
        // Reff: https://www.geeksforgeeks.org/sort-string-characters/
        char []arr = str.toCharArray();
        Arrays.sort(arr);// sort the array

        return new String(arr);

    }
    public String palindrome(String input){
        //reff: https://www.geeksforgeeks.org/reverse-a-string-in-java/
        byte[] strAsByteArray = input.getBytes();
  
        byte[] str1 = new byte[strAsByteArray.length];
  
        // Store result in reverse order into the result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            str1[i] = strAsByteArray[strAsByteArray.length - i - 1];
        String str2 = new String(str1);
        //combine original string and the reversed strign 
        String result = input + str2;
        return result;


    }

    public void print(String str){
        System.out.println(str);
    }
}
