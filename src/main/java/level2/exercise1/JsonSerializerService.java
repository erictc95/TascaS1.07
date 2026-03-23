package level2.exercise1;

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
            String dir = getDirectory(worker);
            createDirectoryIfNotExists(dir);
            String fileName = buildFileName(dir, worker);
            writeJson(worker, fileName);
        }
    }

    private String getDirectory(Worker worker) {
        JsonSerializable annotation = worker.getClass().getAnnotation(JsonSerializable.class);

        if (annotation != null) {
            return annotation.directory();
        }

        return "output/json";
    }

    private void createDirectoryIfNotExists(String dir) {
        File folder = new File(dir);
        if (!folder.exists()) {
            folder.mkdirs();
        }
    }

    private String buildFileName(String dir, Worker worker) {
        return dir + "/" + worker.getName() + "_" + worker.getLastName() + ".json";
    }

    private void writeJson(Worker worker, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(worker, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
