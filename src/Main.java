public class Main {
    public static void main(String[] args) {
        int[] sales = {
                1,
                3,
                5
        };
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}