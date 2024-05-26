public class InsertionSort {
    public static int[] insertionSortMainMethod(int[] inputArray){
        for (int i = 1; i < inputArray.length; i++) {
            int target = inputArray[i];
            while (i > 0 && target < inputArray[i-1]) {
                int temp = inputArray[i-1];
                inputArray[i-1] = inputArray[i];
                inputArray[i] = temp;
                i--;
            }
        }
        return inputArray;
    }
    public static void main(String[] args) {
        int[] inputArray = {2,4,5,1,3};
        for (int i : insertionSortMainMethod(inputArray)) {
            System.out.println(i);
        }
    }
}
