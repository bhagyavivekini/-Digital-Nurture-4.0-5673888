
package financial_forecast;

public class Forecast {
    public static double calculateAverage(double[] income) {
        double sum = 0;
        for (double value : income) {
            sum += value;
        }
        return sum / income.length;
    }

    public static double forecastNextMonth(double[] income) {
        double lastMonth = income[income.length - 1];
        double average = calculateAverage(income);
        double growthRate = (lastMonth - income[0]) / income[0]; // simple growth formula

        return lastMonth + (average * growthRate); // forecasted income
    }
}
