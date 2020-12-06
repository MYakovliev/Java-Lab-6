package by.bntu.fitr.poisit.lab06.model.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    ArrayService service = new ArrayService();

    @Test
    void findMaxAbsIndex() {
    }

    @Test
    void calculateAmountThatMore() {
    }

    @Test
    void calculateMultiplyAfterBiggest() {
    }

    @Test
    void rfind() {
    }

    @Test
    void calculateSumAllPositive1() {
        int expected = 25;
        int actual = service.calculateSumAllPositive(new int[]{-5, 2, 13, 0, 10, -2, -125});

        assertEquals(expected, actual);
    }

    @Test
    void calculateSumAllPositive2() {
        int expected = 0;
        int actual = service.calculateSumAllPositive(new int[]{-5, -2, -13, 0, -10, -2, -125});

        assertEquals(expected, actual);
    }

    @Test
    void calculateSumAfterLast1() {
        int expected = 13;
        int actual = service.calculateSumAfterLast(new int[]{24, 0, 123, 1, 0, 5, 6, 2}, 0);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSumAfterLast2() {
        int expected = 0;
        int actual = service.calculateSumAfterLast(new int[]{2, 0, 123, 1, 0, 5, 6, 2}, 2);

        assertEquals(expected, actual);
    }
}