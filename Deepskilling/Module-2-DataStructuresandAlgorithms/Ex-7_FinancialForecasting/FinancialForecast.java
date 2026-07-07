public class FinancialForecast {

    
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {

        if (years == 0) {
            return presentValue;
        }

        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10;   // 10%
        int years = 5;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate : " + (growthRate * 100) + "%");
        System.out.println("Years : " + years);
        System.out.printf("Future Value : %.2f\n", futureValue);

    }
}