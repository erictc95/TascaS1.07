package level2.exercise1;

@SuppressWarnings("deprecation")
public class WorkerMain {

    public static void main(String[] args) {

        Worker[] workers = createWorkers();

        JsonSerializerService serializer = new JsonSerializerService();
        serializer.serialize(workers);

        executeLegacyMethods(workers);
    }

    private static Worker[] createWorkers() {
        return new Worker[]{
                new OnlineWorker("Panoramix", "Galix", 60),
                new OnlineWorker("Pascual", "Lactovit", 30),
                new FaceToFaceWorker("Conde", "Draculus", 20),
                new FaceToFaceWorker("John", "Damm", 75)
        };
    }

    @SuppressWarnings("deprecation")
    private static void executeLegacyMethods(Worker[] workers) {
        for (Worker worker : workers) {
            worker.oldMethod(100);
        }
    }
}
