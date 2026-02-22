package level2.exercise1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WorkerMain {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        OnlineWorker ow1 = new OnlineWorker("Panoramix", "Galix", 60);
        OnlineWorker ow2 = new OnlineWorker("Pascual", "Lactovit", 30);
        FaceToFaceWorker ftfw1 = new FaceToFaceWorker("Conde", "Draculus", 20);
        FaceToFaceWorker ftfw2 = new FaceToFaceWorker("John", "Damm", 75);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Worker[] workers = {ow1, ow2, ftfw1, ftfw2};


        for (Worker worker : workers) {
            JsonSerializable annotation = worker.getClass().getAnnotation(JsonSerializable.class);
            String dir = "output/json";
            if (annotation != null) {
                dir = annotation.directory();
            }


            File folder = new File(dir);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            String fileName = dir + "/" + worker.getName() + "_" + worker.getLastName() + ".json";

            try (FileWriter writer = new FileWriter(fileName)) {
                gson.toJson(worker, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        ow1.oldMethod(150);
        ow2.calculateSalary(150);
        ftfw1.oldMethod(120);
        ftfw2.calculateSalary(120);

    }
}
