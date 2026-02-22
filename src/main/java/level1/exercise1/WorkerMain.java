package level1.exercise1;

public class WorkerMain {
    public static void main(String[] args) {

        Worker ow1 = new OnlineWorker("Panoramix", "Galix", 45);
        Worker ftfw1 = new FaceToFaceWorker("Conde", "Draculus", 35);

        // Mostrar datos de los trabajadores
        System.out.println(ow1);
        System.out.println(ftfw1);

        int hoursOnline = 160;
        int hoursFace = 200;

        // Calcular y mostrar salarios
        System.out.println("Salary of Online Worker: " + ow1.calculateSalary(hoursOnline) + "€");
        System.out.println("Salary of Face-to-Face Worker: " + ftfw1.calculateSalary(hoursFace) + "€");


    }
}
