package ru.netology.stats.infostatistics;

public class Statistics {
    public long TotalSales(int[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; ++i) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public long AverageSales(int[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; ++i) {
            sumSales += sales[i];
        }
        return (int) sumSales / sales.length;
    }

    public int PeakSales(int[] sales) {
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

    public int MinimumSales(int[] sales) {
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

    public int NumberMonthsAboveAverage(int[] sales) {
        long average = AverageSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; ++i) {
            if (average < sales[i]) {
                count++;
            }
        }
        return count;
    }

    public int NumberMonthsLessThatAverage(int[] sales) {
        long average = AverageSales(sales);
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
