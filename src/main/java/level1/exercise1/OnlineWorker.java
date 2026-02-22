package level1.exercise1;


public class OnlineWorker extends Worker{
    private static final int INTERNET_PRICE = 30;

    public OnlineWorker (String name, String lastName, double hourPrice) {
        super(name, lastName, hourPrice);
    }


    @Override
    public double calculateSalary(int workedHours) {
        return (workedHours * getHourPrice()) + INTERNET_PRICE;
    }
}
