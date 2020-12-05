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
}
