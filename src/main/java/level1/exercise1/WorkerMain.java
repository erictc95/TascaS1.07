package level1.exercise1;

public class WorkerMain {
    public static void main(String[] args) {
        Worker ow1 = createOnlineWorker();
        Worker ftfw1 = createFaceToFaceWorker();

        printWorker(ow1);
        printWorker(ftfw1);

        printSalary(ow1, 160);
        printSalary(ftfw1, 200);

    }

    private static Worker createOnlineWorker() {
        return new OnlineWorker("Panoramix", "Galix", 45);
    }

    private static Worker createFaceToFaceWorker() {
        return new FaceToFaceWorker("Conde", "Draculus", 35);
    }

    private static void printWorker(Worker worker) {
        System.out.println(worker);
    }

    private static void printSalary(Worker worker, int hours) {
        double salary = worker.calculateSalary(hours);
        System.out.println("Salary of " + worker.getClass().getSimpleName() + ": " + worker.calculateSalary(hours) + "€");
    }
}
