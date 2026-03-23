package level3.exercise1;

public class FaceToFaceWorker extends Worker {
    private static final double GASOLINE = 50;

    public FaceToFaceWorker (String name, String lastName, double hourPrice) {
        super (name, lastName, hourPrice);
    }

    @Override
    public double calculateSalary(int workedHours) {
        return (workedHours * getHourPrice()) + GASOLINE;
    }

    @Deprecated
    public void oldMethod(int workedHours) {
        System.out.println("Deprecated in FaceToFaceWorker. Use calculateSalary() instead.");
    }
}
