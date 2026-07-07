public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        System.out.println("Stock Price Updated\n");

        stockMarket.setStock("TCS", 4250.50);

        System.out.println("Another Stock Update\n");

        stockMarket.setStock("Infosys", 1599.75);

    }

}