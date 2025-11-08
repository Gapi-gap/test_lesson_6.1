package ru.netology.stats.infostatistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatisticsTest {
    @Test
    public void generalTestForTheSumOfAllSales() {
        Statistics objStatistics = new Statistics();
        long[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 75};
        long sum = objStatistics.totalSales(sales);
        long expected = 479;
        Assertions.assertEquals(expected, sum);
    }

    @Test
    public void generalTestForTheAverageOfAllSales() {
        Statistics objStatistics = new Statistics();
        long[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 75};
        long sum = objStatistics.averageSales(sales);
        double expected = 39;
        Assertions.assertEquals(expected, sum);
    }

    @Test
    public void maximumSalesInTheMonth() {
        Statistics objStatistics = new Statistics();
        long[] sales = {22, 75, 44, 55, 33, 11, 15, 35, 64, 75, 25, 75};
        int index = objStatistics.peakSales(sales);
        int expected = 12;
        Assertions.assertEquals(expected, index);
    }

    @Test
    public void minimumSalesInTheMonth() {
        Statistics objStatistics = new Statistics();
        long[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 11};
        int index = objStatistics.minimumSales(sales);
        int expected = 12;
        Assertions.assertEquals(expected, index);
    }

    @Test
    public void theNumberTheMonthsIsGreaterThanAverage() {
        Statistics objStatistics = new Statistics();
        long[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 75};
        int count = objStatistics.numberMonthsAboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, count);
    }

    @Test
    public void numberOfMonthsLessThanAverage() {
        Statistics objStatistics = new Statistics();
        long[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 75};
        int count = objStatistics.numberMonthsLessThatAverage(sales);
        int expected = 7;
        Assertions.assertEquals(expected, count);
    }
}
