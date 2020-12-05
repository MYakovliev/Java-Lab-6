package by.bntu.fitr.poisit.lab06.model.service;

public class ArrayService {
    public int findMaxAbsIndex(double[] array){
        int maxAbs = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < Math.abs(array[maxAbs])){
                maxAbs = i;
            }
        }
        return maxAbs;
    }

    public int calculateAmountThatMore(double[] array, double number){
        int count = 0;
        for (double element: array) {
            if(element > number) {
                count++;
            }
        }
        return count;
    }

    public double calculateMultiplyAfterBiggest(double[] array){
        double multiply = 1;
        int max = findMaxAbsIndex(array);
        for (int i = max + 1; i < array.length; i++) {
            multiply *= array[i];
        }
        return multiply;
    }

    public int rfind(int[] array, int element) {
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == element) {
                i = j;
            }
        }
        return i;
    }

    public int calculateSumAllPositive(int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element > 0) {
                sum += element;
            }
        }
        return sum;
    }

    public int calculateSumAfterLast(int[] array, int lastElement) {
        int sum = 0;
        for (int i = rfind(array, lastElement); i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
