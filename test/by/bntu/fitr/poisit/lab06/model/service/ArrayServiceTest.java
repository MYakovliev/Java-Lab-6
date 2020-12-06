package by.bntu.fitr.poisit.lab06.model.service;

import by.bntu.fitr.poisit.lab06.exception.InvalidRangeException;
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

    @Test
    void calculateQuantityInRange1() {
        int expected = 4;
        try {
            int actual = service.calculateQuantityInRange(
                    new double[]{5.2 , 3.8, 1.2, 5.5, 13.3, 24.2}, 1.2, 5.5);
        } catch (InvalidRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void calculateQuantityInRange2()  {
        Throwable thrown = assertThrows(InvalidRangeException.class, () -> {
            service.calculateQuantityInRange(new double[]{1}, 5.5, 1.1);
        });
    }
}