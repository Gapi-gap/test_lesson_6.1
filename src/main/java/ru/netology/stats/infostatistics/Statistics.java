package ru.netology.stats.infostatistics;

public class Statistics {
    public long totalSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; ++i) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; ++i) {
            sumSales += sales[i];
        }
        return (long) sumSales / sales.length;
    }

    public int peakSales(long[] sales) {
        long max = Long.MIN_VALUE;
        int mother = -1;
        for (int i = 0; i < sales.length; ++i) {
            if (max <= sales[i]) {
                max = sales[i];
                mother = i;
            }
        }
        return mother + 1;
    }

    public int minimumSales(long[] sales) {
        long min = Long.MAX_VALUE;
        int mother = 0;
        for (int i = 0; i < sales.length; ++i) {
            if (min >= sales[i]) {
                min = sales[i];
                mother = i;
            }
        }
        return mother + 1;
    }

    public int numberMonthsAboveAverage(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; ++i) {
            if (average < sales[i]) {
                count++;
            }
        }
        return count;
    }

    public int numberMonthsLessThatAverage(long[] sales) {
        long average = averageSales(sales);
        System.out.println(average);
        int count = 0;
        for (int i = 0; i < sales.length; ++i) {
            if (average > sales[i]) {
                count++;

            }
        }
        return count;
    }
}
