package level1.exercise2;


public class WorkerMain {
    public static void main(String[] args) {
        Worker ow1 = createOnlineWorker();
        Worker ftfw1 = createFaceToFaceWorker();

        printWorkers(ow1, ftfw1);
        calculateSalaries(ow1, ftfw1);
        useDeprecationMethods(ow1, ftfw1);

    }

    private static Worker createOnlineWorker() {
        return new OnlineWorker("Panoramix", "Galix", 60);
    }

    private static Worker createFaceToFaceWorker() {
        return new FaceToFaceWorker("Conde", "Draculus", 20);
    }

    private static void printWorkers(Worker w1, Worker w2) {
        System.out.println(w1);
        System.out.println(w2);
    }

    private static void calculateSalaries(Worker ow, Worker ftfw) {
        int hoursOnline = 160;
        int hoursFace = 200;

        System.out.println("Salary of Online Worker: " + ow.calculateSalary(hoursOnline) + "€");
        System.out.println("Salary of Face-To-Face Worker: " + ftfw.calculateSalary(hoursFace) + "€");
    }

    @SuppressWarnings("deprecation")
    private static void useDeprecationMethods(Worker ow, Worker ftfw) {
        ((OnlineWorker) ow).oldCalculate();
        ((FaceToFaceWorker) ftfw).oldCalculate();
    }
}
