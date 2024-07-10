import java.util.Arrays;

 class RearrangeDigits {
    public static void main(String[] args) {
        int input = 34598;

        // Count the number of digits in the input number
        int numDigits = (int) Math.log10(input) + 1;
        
        // Create an array to store the digits
        int[] digitsArray = new int[numDigits];

        // Extract and store each digit in the array
        int temp = input;
        for (int i=0;i<=numDigits-1;i++) {
            digitsArray[i] = temp % 10;
            temp /= 10;
            
        }
 
        // Sort the array of digits in descending order
        Arrays.sort(digitsArray);

        // Create a new number by combining the sorted digits
        int output = 0;
        for (int i = 0; i < numDigits; i++) {
            output = output * 10 + digitsArray[numDigits - 1 - i];
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
