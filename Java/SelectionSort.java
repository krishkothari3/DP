
public class SelectionSort{
    public static int[] selectionSortMainMethod(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            int minimumIndex = i;
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[j] < inputArray[minimumIndex]){
                    minimumIndex = j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[minimumIndex];
            inputArray[minimumIndex] = temp;
        }        
        return inputArray;
    }
    public static void main(String[] args) {
        int[] inputString = {13, 46, 24, 52, 20, 9};
        int[] sortedString = selectionSortMainMethod(inputString);
        for (int i = 0; i < sortedString.length; i++) {
            System.out.println(sortedString[i]);
        }
    }
}