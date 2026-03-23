package level3.exercise1;

import java.lang.annotation.Annotation;

public class AnnotationInspector {
    public static void inspect(Object obj) {
        Class<?> clazz = obj.getClass();

        if (clazz.isAnnotationPresent(JsonSerializable.class)) {
            JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);

            System.out.println("Annotation detected!");
            System.out.println("Directory: " + annotation.directory());
        } else {
            System.out.println("Annotation not present.");
        }

        printAllAnnotations(clazz);
    }

    private static void printAllAnnotations(Class<?> clazz) {
        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation a : annotations) {
            System.out.println(a);
        }
    }
}
