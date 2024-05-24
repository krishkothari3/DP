public class ReverseTheArray {
    public static int[] arrayReverse(int[] inputArray){
        int n = inputArray.length;
        int[] reversedArray = new int[n];
        for (int i = n - 1; i >= 0 ; i--) {
            reversedArray[n-i-1] = inputArray[i];

        }
        return reversedArray;
    }
    public static void main(String[] args) {
        int[] inputArray = {5,4,3,2,1};
        int[] outputArray = arrayReverse(inputArray);
        for (int i = 0; i < outputArray.length; i++) {
            System.out.println(outputArray[i]); 
        }
    }    
}
