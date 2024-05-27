public class PascalTriangle {
    public static int factorial(int inputNumber){
        if (inputNumber == 1 || inputNumber == 0) {
            return inputNumber;
        }
        int demo = 1;
        for (int i = 2; i <= inputNumber; i++) {
           demo *= i; 
        }
        return demo;
    }
    public static int pascalTrianglePosition(int row, int column){
        if (column > row || column < 0 || row < 0) {
            return -1;
        }
        return factorial(row) / (factorial(column) * factorial(row - column));
    } 
    public static void main(String[] args) {
        int row = 4;
        int column = 2;
        if (pascalTrianglePosition(row, column) == -1) {
            System.out.println("Enter valid row and column");
        }
        else{
            System.out.println(pascalTrianglePosition(row, column));
        }
    }
}
