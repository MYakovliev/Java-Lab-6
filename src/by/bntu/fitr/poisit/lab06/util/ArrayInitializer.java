package by.bntu.fitr.poisit.lab06.util;

import by.bntu.fitr.poisit.lab06.exception.NotEnoughDataException;
import com.sun.istack.internal.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayInitializer {
    private static final String DEFAULT_FILENAME_INT = ".\\data\\data.txt";
    private static final String DEFAULT_FILENAME_DOUBLE = ".\\data\\data1.txt";

    public void initializeFromFile(@NotNull int[] array, String filename) throws NotEnoughDataException {
        int i = 0;
        try (Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextInt() && i < array.length ){
                array[i] = scanner.nextInt();
                i++;
            }
            if (i < array.length){
                throw new NotEnoughDataException("not enough data in " + filename);
            }
        } catch (FileNotFoundException e){
            initializeFromFile(array, DEFAULT_FILENAME_INT);
        }
    }

    public void initializeFromFile(@NotNull double[] array, String filename) throws NotEnoughDataException {
        int i = 0;
        try (Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextDouble() && i < array.length ){
                array[i] = scanner.nextDouble();
                i++;
            }
            if (i < array.length){
                throw new NotEnoughDataException("not enough data in " + filename);
            }
        } catch (FileNotFoundException e){
            initializeFromFile(array, DEFAULT_FILENAME_DOUBLE);
        }
    }

    public void initializeFromConsole(@NotNull int[] array){
        int i = 0;
        try (Scanner scanner = new Scanner(System.in)){
            while(i < array.length ){
                array[i] = scanner.nextInt();
                i++;
            }
        } catch (InputMismatchException e){
            e.printStackTrace();
        }
    }

    public void initializeFromConsole(@NotNull double[] array){
        int i = 0;
        try (Scanner scanner = new Scanner(System.in)){
            while(i < array.length ){
                array[i] = scanner.nextDouble();
                i++;
            }
        } catch (InputMismatchException e){
            e.printStackTrace();
        }
    }

    public void initializeRandomly(@NotNull int[] array, int min, int max){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt()%(max - min) + min;
        }
    }

    public void initializeRandomly(@NotNull double[] array, double min, double max){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble()%(max - min) + min;
        }
    }
}
