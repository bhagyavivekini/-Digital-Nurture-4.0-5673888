package financial_forecast;

public class Main {
    public static void main(String[] args) {
        double[] monthlyIncome = {10000, 12000, 15000, 17000, 20000};

        double average = Forecast.calculateAverage(monthlyIncome);
        double prediction = Forecast.forecastNextMonth(monthlyIncome);

        System.out.println("Average Income: Rs." + average);
        System.out.println("Forecasted Income for Next Month: Rs." + prediction);
    }
}
