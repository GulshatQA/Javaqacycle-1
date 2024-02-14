package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.nio.file.Files;

public class RestServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000,3",
//            "100000,60000,150000,2"
//    })
    @CsvFileSource(files="src/test/resources/RestOfMonths.csv")
    public void testCalcRestOfMonthsInYearOne(int income, int expenses, int threshold, int expected) {
        RestService service = new RestService();
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//
//        int expected = 3;
        int actual = service.calcRestOfMonthsInYear(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testCalcRestOfMonthsInYearTwo() {
//        RestService service = new RestService();
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//
//        int expected = 2;
//        int actual = service.calcRestOfMonthsInYear(income, expenses, threshold);
//        Assertions.assertEquals(expected, actual);
//    }
}
