public class BubbleSort {
    public static int[] bubbleSortMainMethod(int[] inputArray){
            boolean isChanged = true;
            while(isChanged){
                isChanged = false;
                for (int j = 0; j < inputArray.length - 1; j++) {
                    if(inputArray[j] > inputArray[j+1]){
                        int temp = inputArray[j+1];
                        inputArray[j+1] = inputArray[j];
                        inputArray[j] = temp;
                        isChanged = true;
                    }
                }
            }
        return inputArray;
    }
    public static void main(String[] args) {
        int[] inputArray = {3,2,5,1,4};
        int[] outputArray = bubbleSortMainMethod(inputArray);
        for (int i : outputArray) {
            System.out.println(i);
        }
    }
}
