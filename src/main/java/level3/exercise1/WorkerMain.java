package level3.exercise1;

@SuppressWarnings("deprecation")
public class WorkerMain {

    public static void main(String[] args) {

        Worker[] workers = createWorkers();

        AnnotationInspector.inspect(workers[0]);
        JsonSerializerService serializer = new JsonSerializerService();
        serializer.serialize(workers);

    }

    private static Worker[] createWorkers() {
        return new Worker[]{
                new OnlineWorker("Asterix", "Buenix", 260),
                new FaceToFaceWorker("Obelix", "Redondix", 300)
        };
    }
}
