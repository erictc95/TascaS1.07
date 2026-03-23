package level3.exercise1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSerializerService {

    private final Gson gson;

    public JsonSerializerService() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void serialize(Worker[] workers) {
        for (Worker worker : workers) {

            JsonSerializable annotation = worker.getClass().getAnnotation(JsonSerializable.class);

            String dir = "output/json";
            if (annotation != null) {
                dir = annotation.directory();
            }

            createDirectory(dir);

            String fileName = dir + "/" + worker.getName() + "_" + worker.getLastName() + ".json";

            writeJson(worker, fileName);
        }
    }

    private void createDirectory(String dir) {
        File folder = new File(dir);
        if (!folder.exists()) {
            folder.mkdirs();
        }
    }

    private void writeJson(Worker worker, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(worker, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
