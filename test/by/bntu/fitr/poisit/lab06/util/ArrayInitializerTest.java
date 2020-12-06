package by.bntu.fitr.poisit.lab06.util;

import by.bntu.fitr.poisit.lab06.exception.NotEnoughDataException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayInitializerTest {
    ArrayInitializer arrayInitializer = new ArrayInitializer();

    @Test
    void initializeFromFile() {
        int[] expected = {12, 13, 15, -9, 0, 59, -69};
        int[] actual = new int[7];
        try {
            arrayInitializer.initializeFromFile(actual, "");
        } catch (NotEnoughDataException e) {
            fail(e.getMessage());
        }
        assertArrayEquals(actual, expected);
    }

    @Test
    void testInitializeFromFile() {
        double[] expected = {12.3, 14.5, 16.8, 47.5, -78.6, -794.112, 0.0};
        double[] actual = new double[7];
        try {
            arrayInitializer.initializeFromFile(actual, "");
        } catch (NotEnoughDataException e) {
            fail(e.getMessage());
        }
        assertArrayEquals(actual, expected);
    }
}