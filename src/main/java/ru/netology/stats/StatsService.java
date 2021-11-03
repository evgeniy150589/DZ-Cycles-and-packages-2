package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {

            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return salesAmount(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int findMonthBelowAvg(int[] sales) {
        int belowAvg = 0;
        for (int sale : sales) {
            if (sale < findAvg(sales)) {
                belowAvg++;
            }
        }
        return belowAvg;
    }
    public int findMonthAboveAvg(int[] sales) {
        int aboveAvg = 0;
        for (int sale : sales) {
            if (sale < findAvg(sales)) {
                aboveAvg++;
            }
        }
        return aboveAvg;
    }
}

