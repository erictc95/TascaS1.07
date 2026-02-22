package level1.exercise2;

public class WorkerMain {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        OnlineWorker ow1 = new OnlineWorker("Panoramix", "Galix", 60);
        FaceToFaceWorker ftfw1 = new FaceToFaceWorker("Conde", "Draculus", 20);

        ow1.oldMethod(150);
        ftfw1.oldMethod(120);

    }
}
