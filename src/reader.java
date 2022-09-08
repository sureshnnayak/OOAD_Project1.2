import java.util.Scanner; 
import java.lang.Math;


public class reader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the array values:");
        float inputArray[];    //declaring array
        inputArray = new float[50];  // allocating memory to array
        
        int i= 0;
        String str = scan.nextLine();
        while(!str.isEmpty()){
            inputArray[i] =  Float.parseFloat(str);
            i++;
            str = scan.nextLine();
        } int n = i;
        System.out.println("Input array is: ");
        for (i = 0; i<n; i ++){
            System.out.print(inputArray[i]+ ", ");

        }
        System.out.println("");
        //System.out.print(inputArray);

        Analyzer a = new Analyzer();
        a.analyze(inputArray,n);

        
    }   



    
}

class Analyzer{
        /*median */
        public void analyze (float inputArray[], int n){
            median(inputArray,n);
            mean(inputArray,n);
            mode(inputArray,n);
            variance(inputArray,n);
            standardDeviation(inputArray,n);
            minimumValue(inputArray,n);
            maximumValue(inputArray,n);
            maximumOccurrences(inputArray,n);
        }
        public float median(float inputArray[], int n){
            float temp ;
            for (int i = 0; i <n; i++){
                for(int j=i; j<n; j++){
                    
                    if (inputArray[i]> inputArray[j]){
                        temp = inputArray[i];
                        inputArray[j] = inputArray[i];
                        inputArray[j] = temp;
                    }
                }
            }
            float result = inputArray[(int)(n/2)];
            System.out.println("Median is :"+ result);
            return result;
        }
        
        /*  mean */
        public float mean(float [] inputArray, int n){
            float result = 0;
            float arrSum = 0;

            for (int i =0; i < n; i++){
                
                arrSum += inputArray[i];
            }
            result = arrSum/n;
            System.out.println("Mean is :"+ result);
    
            return result;
        }

        /* mode */
        public float mode(float inputArray[], int n){
            
            float maxCount= 0, result = 0;
            for (int i = 0; i < n; ++i) {
                float count = 0;
                for (int j = 0; j < n; ++j) {
                    if (inputArray[j] == inputArray[i])
                    ++count;
                }

            if (count > maxCount) {
                maxCount = count;
                result = inputArray[i];
                }
            }
            System.out.println("Mode is :"+ result);
            return result;
        }

        /* variance  */
        public double variance(float inputArray[], int n){
            //reff : https://www.geeksforgeeks.org/program-for-variance-and-standard-deviation-of-an-array/
            double sum = 0;
            for (int i = 0; i < n; i++){
                sum += inputArray[i];
            }
            double mean = (double)sum /
                        (double)n;

            double sqDiff = 0;
            for (int i = 0; i < n; i++)
                sqDiff += (inputArray[i] - mean) *
                        (inputArray[i] - mean);
            
            double result =  (double)sqDiff / n;
            
            System.out.println("Varience is :"+ result);
        
            return result;
        }

        /* standard deviation  */
        public double standardDeviation (float inputArray[], int n){
            //reff ; https://www.geeksforgeeks.org/java-program-to-calculate-standard-deviation/
            double result;
            double  standardDeviation= 0, sq;
            float Total = 0;
            for (int i = 0; i < n; i++) {
                Total = Total + inputArray[i];
            }
           
            double mean = (double)(Total / (n));
     
            for (int i = 0; i < n; i++) {
               
                standardDeviation
                    = standardDeviation + Math.pow((inputArray[i] - mean), 2);
               
            }
           
            sq = standardDeviation / n;
            result = Math.sqrt(sq);
            System.out.println("standard Deviation is :"+ result);
            return 2;
        }


        /* minimum value */
        public float minimumValue (float inputArray[], int n){
            float result = inputArray[0] ;
            for (int i =0; i < n; i++){
                if (result > inputArray[i]){
                    result = inputArray[i];
                }
            }
            System.out.println("Minimum Value is :"+ result);
            return result;
        }


        /* maximum value */
        public float maximumValue(float inputArray[], int n){
            float result = inputArray[0] ;
            for (int i =0; i < n; i++){
                if (result < inputArray[i]){
                    result = inputArray[i];
                }
            }
            System.out.println("Maximum Value is :"+ result);
            return result;
        }
    
        /* maximum occurrences – value and count (if the number 2 was in the list 3 times, and other 
        numbers were not duplicated more than 3 times) the answer is value 2, count 3. */
        public float maximumOccurrences(float inputArray[], int n){
            
            float maxCount= 0, maxValue = 0;
            float result = 0;
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
            result = maxCount;
            System.out.println("Maximum occurence is :"+ result+ "for value: "+ maxValue);
            return maxValue;

        }
    
}
