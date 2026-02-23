package level3.exercise1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;


public class WorkerMain {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Worker worker1 = new OnlineWorker("Asterix", "Buenix", 260);
        Worker worker2 = new FaceToFaceWorker("Obelix", "Redondix", 300);

        Class<?> clazz = worker1.getClass();

        if (clazz.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);

            System.out.println("Annotation detected!");
            System.out.println("Directory: " + annotation.directory());
        } else {
            System.out.println("Annotation not present.");
        }

        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation a : annotations) {
            System.out.println(a);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Worker[] workers = {worker1, worker2};


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

    }
}
