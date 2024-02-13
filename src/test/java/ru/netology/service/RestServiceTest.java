package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
    @Test
    public void testCalcRestOfMonthsInYearOne() {
        RestService service = new RestService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;
        int actual = service.calcRestOfMonthsInYear(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcRestOfMonthsInYearTwo() {
        RestService service = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;
        int actual = service.calcRestOfMonthsInYear(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
