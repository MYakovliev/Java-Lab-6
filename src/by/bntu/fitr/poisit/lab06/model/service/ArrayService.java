package by.bntu.fitr.poisit.lab06.model.service;

import by.bntu.fitr.poisit.lab06.exception.InvalidRangeException;
import com.sun.istack.internal.NotNull;


public class ArrayService {
    public int findMaxAbsIndex(@NotNull double[] array) {
        int maxAbs = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < Math.abs(array[maxAbs])) {
                maxAbs = i;
            }
        }
        return maxAbs;
    }

    public int calculateAmountThatMore(@NotNull double[] array, double number) {
        int count = 0;
        for (double element : array) {
            if (element > number) {
                count++;
            }
        }
        return count;
    }

    public double calculateMultiplyAfterBiggest(@NotNull double[] array) {
        double multiply = 1;
        int max = findMaxAbsIndex(array);
        for (int i = max + 1; i < array.length; i++) {
            multiply *= array[i];
        }
        return multiply;
    }

    public int rfind(@NotNull int[] array, int element) {
        for (int j = array.length - 1; j >= 0; j--) {
            if (array[j] == element) {
                return j;
            }
        }
        return -1;
    }

    public int calculateSumAllPositive(@NotNull int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element > 0) {
                sum += element;
            }
        }
        return sum;
    }

    public int calculateSumAfterLast(@NotNull int[] array, int lastElement) {
        int sum = 0;
        for (int i = rfind(array, lastElement) + 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int calculateQuantityInRange(@NotNull double[] array, double a, double b) throws InvalidRangeException {
        if (b < a) {
            throw new InvalidRangeException("b is less than a");
        }
        int counter = 0;
        for (double element : array) {
            if (element >= a && element <= b) {
                counter++;
            }
        }
        return counter;
    }
}
