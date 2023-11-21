package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sales) {  // сумма всех продаж
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgAllSales(int[] sales) { //средняя сумма продаж в месяц
        int avg;
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        avg = sum / sales.length;

        return avg;
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

    public int maxSales(int[] sales) { //номер последнего месяца с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int salesLowAverage(int[] sales) { //количество месяцев, в которых продажи были ниже среднего
        int avg;
        int sum = 0;
        int lowAverage = 0;

        for (int sale : sales) {
            sum += sale;
        }

        avg = sum / sales.length;

        for (int sale : sales)
            if (sale < avg) {
                lowAverage++;
            }

        return lowAverage;
    }

    public int salesHighAverage(int[] sales) { //количество месяцев, в которых продажи были выше среднего
        int avg;
        int sum = 0;
        int highAverage = 0;

        for (int sale : sales) {
            sum += sale;
        }

        avg = sum / sales.length;

        for (int sale : sales)
            if (sale > avg) {
                highAverage++;
            }

        return highAverage;
    }
}
