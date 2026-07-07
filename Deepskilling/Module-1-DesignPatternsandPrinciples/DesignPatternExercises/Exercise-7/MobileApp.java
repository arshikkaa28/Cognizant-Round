public class MobileApp implements Observer {

    @Override
    public void update(String stockName, double price) {

        System.out.println("Mobile App");
        System.out.println("Stock : " + stockName);
        System.out.println("Price : " + price);
        System.out.println();

    }

}