import java.util.Scanner; 

public class reader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the array values:");
        int inputArray[];    //declaring array
        inputArray = new int[50];  // allocating memory to array3
        
        int i= 0;
        String str = scan.nextLine();
        while(!str.isEmpty()){
            inputArray[i] =  Integer.parseInt(str);
            i++;
            str = scan.nextLine();
        }

       // System.out.println(inputArray);

        Analyzer a = new Analyzer();
        a.mean(inputArray);

        
    }   



    
}

class Analyzer{
        /*median */
        public int median(int inputArray[]){
            int result = 0;
            System.out.println("Median is :"+ result);
            return result;
        }
        
        /*  mean */
        public float mean(int [] inputArray){
            float result = 0;
            int arrSum = 0;

            for (int i =0; i < inputArray.length; i++){
                System.out.println(inputArray[i]);
                arrSum += inputArray[i];
            }
            result = arrSum/inputArray.length;
            System.out.println("Mean is :"+ result);
    
            return result;
        }

        /* mode */
        public int mode(int inputArray[]){
            int n = inputArray.length;
            int maxCount= 0, maxValue = 0;
            for (int i = 0; i < n; ++i) {
                int count = 0;
                for (int j = 0; j < n; ++j) {
                    if (inputArray[j] == inputArray[i])
                    ++count;
                }

            if (count > maxCount) {
                maxCount = count;
                maxValue = inputArray[i];
                }
            }
    
            return maxValue;
        }

        /* variance  */
        public int variance(int inputArray[]){
    
            return 2;
        }

        /* standard deviation  */
        public int standardDeviation (int inputArray[]){
    
            return 2;
        }


        /* minimum value */
        public int minimumValue (int inputArray[]){
            int result = inputArray[0] ;
            for (int i =0; i < inputArray.length; i++){
                if (result < inputArray[i]){
                    result = inputArray[i];
                }
            }
            System.out.println("Minimum Value is :"+ result);
            return result;
        }


        /* maximum value */
        public int maximumValue(int inputArray[]){
            int result = inputArray[0] ;
            for (int i =0; i < inputArray.length; i++){
                if (result > inputArray[i]){
                    result = inputArray[i];
                }
            }
            System.out.println("Minimum Value is :"+ result);
            return result;
        }
    
        /* maximum occurrences – value and count (if the number 2 was in the list 3 times, and other 
        numbers were not duplicated more than 3 times) the answer is value 2, count 3. */
        public int maximumOccurrences(int inputArray[]){
            int n = inputArray.length;
            int maxCount= 0, maxValue = 0;
            for (int i = 0; i < n; ++i) {
                int count = 0;
                for (int j = 0; j < n; ++j) {
                    if (inputArray[j] == inputArray[i])
                    ++count;
                }

            if (count > maxCount) {
                maxCount = count;
                maxValue = inputArray[i];
                }
            }
    
            return maxValue;

        }
    
}
