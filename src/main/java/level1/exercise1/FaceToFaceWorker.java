package level1.exercise1;

public class FaceToFaceWorker extends Worker{
    private static double gasoline = 50;

    public FaceToFaceWorker (String name, String lastName, double hourPrice) {
        super (name, lastName, hourPrice);
    }

    @Override
    public double calculateSalary(int workedHours) {
        return (workedHours * getHourPrice()) + gasoline;
    }
}
