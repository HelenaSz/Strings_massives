import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();

        System.out.println("The sum of all the array elements is " + service.sumAllSales(sales));

        System.out.println("The average of all the array elements is " + service.avgAllSales(sales));

        System.out.println("The month number with sales for the minimum amount is " + service.minSales(sales));

        System.out.println("The month number with sales for the maximum amount is " + service.maxSales(sales));

        System.out.println("The number of the month(s) with low average sales " + service.salesLowAverage(sales));

        System.out.println("The number of the month(s) with high average sales " + service.salesHighAverage(sales));
    }
}