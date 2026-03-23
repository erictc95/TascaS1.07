package level1.exercise2;

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
    public void oldCalculate() {
        System.out.println("Old face-to-face calculation method.");
    }
}
