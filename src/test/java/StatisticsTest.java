import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.infostatistics.Statistics;

public class StatisticsTest {
    @Test
    public void GeneralTestForTheSumOfAllSales() {
        Statistics objStatistics = new Statistics();
        int[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 75};
        long sum = objStatistics.TotalSales(sales);
        int expected = 479;
        Assertions.assertEquals(expected, sum);
    }

    @Test
    public void GeneralTestForTheAverageOfAllSales() {
        Statistics objStatistics = new Statistics();
        int[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 75};
        long sum = objStatistics.AverageSales(sales);
        double expected = 39;
        Assertions.assertEquals(expected, sum);
    }

    @Test
    public void MaximumSalesInTheMonth() {
        Statistics objStatistics = new Statistics();
        int[] sales = {22, 75, 44, 55, 33, 11, 15, 35, 64, 75, 25, 75};
        int index = objStatistics.PeakSales(sales);
        double expected = 12;
        Assertions.assertEquals(expected, index);
    }

    @Test
    public void MinimumSalesInTheMonth() {
        Statistics objStatistics = new Statistics();
        int[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 11};
        long index = objStatistics.MinimumSales(sales);
        double expected = 12;
        Assertions.assertEquals(expected, index);
    }

    @Test
    public void TheNumberTheMonthsIsGreaterThanAverage() {
        Statistics objStatistics = new Statistics();
        int[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 75};
        long count = objStatistics.NumberMonthsAboveAverage(sales);
        double expected = 5;
        Assertions.assertEquals(expected, count);
    }

    @Test
    public void NumberOfMonthsLessThanAverage() {
        Statistics objStatistics = new Statistics();
        int[] sales = {22, 33, 44, 55, 66, 11, 15, 35, 64, 34, 25, 75};
        long count = objStatistics.NumberMonthsLessThatAverage(sales);
        double expected = 7;
        Assertions.assertEquals(expected, count);
    }
}
