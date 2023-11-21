package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void sumAllArrayElements() { //сумма всех продаж
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.sumAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAllArrayElements() { //средняя сумма продаж в месяц
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.avgAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthNumberSalesMinimumAmount() { //номер последнего месяца с минимальными продажами
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthNumberSalesMaximumAmount() { //номер последнего месяца с максимальными продажами
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsLowAverageSales() { //количество месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.salesLowAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsHighAverageSales() { //количество месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.salesHighAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}