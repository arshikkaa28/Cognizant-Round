public class WebApp implements Observer {

    @Override
    public void update(String stockName, double price) {

        System.out.println("Web App");
        System.out.println("Stock : " + stockName);
        System.out.println("Price : " + price);
        System.out.println();

    }

}