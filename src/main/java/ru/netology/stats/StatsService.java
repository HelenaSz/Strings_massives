package ru.netology.stats;

import java.util.ArrayList;
import java.util.Arrays;

public class StatsService {

    public int sumAllSales(int[] sales) {  // сумма всех продаж

        return Arrays.stream(sales).sum();
    }

    public int avgAllSales(int[] sales) { //средняя сумма продаж в месяц

        return Arrays.stream(sales).sum() / sales.length;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер последнего месяца с минимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public String minSalesAll(int[] sales) {  // номера всех месяцев с минимальными продажами
        int minMonth = 0;
        int minValueMonth = 0;
        ArrayList<String> monthsList = new ArrayList<>();

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
                minValueMonth = sales[i];

            }
        }

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == minValueMonth) {
                monthsList.add(String.valueOf(i + 1));
            }
        }

        return String.join(", ", monthsList);
    }

    public int maxSales(int[] sales) { //номер последнего месяца с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public String maxSalesAll(int[] sales) { //номера всех месяцев максимальными продажами
        int maxMonth = 0;
        int maxValueMonth = 0;
        ArrayList<String> monthsList = new ArrayList<>();

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
                maxValueMonth = sales[i];
            }
        }

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == maxValueMonth) {
                monthsList.add(String.valueOf(i + 1));
            }
        }

        return String.join(", ", monthsList);
    }

    public int salesLowAverage(int[] sales) { //количество месяцев, в которых продажи были ниже среднего
        int lowAverage = 0;
        int avg = Arrays.stream(sales).sum() / sales.length;

        for (int sale : sales) {
            if (sale < avg) {
                lowAverage++;
            }
        }

        return lowAverage;
    }

    public int salesHighAverage(int[] sales) { //количество месяцев, в которых продажи были выше среднего
        int highAverage = 0;
        int avg = Arrays.stream(sales).sum() / sales.length;

        for (int sale : sales)
            if (sale > avg) {
                highAverage++;
            }

        return highAverage;
    }
}
