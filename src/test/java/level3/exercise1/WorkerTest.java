package level3.exercise1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    void shouldDetectJsonAnnotation() {
        Worker worker = new OnlineWorker("Asterix", "Buenix", 100);

        JsonSerializable annotation = worker.getClass().getAnnotation(JsonSerializable.class);

        assertNotNull(annotation);
        assertEquals("output/json", annotation.directory());
    }
}
