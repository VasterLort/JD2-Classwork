package by.it.academy.maven;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        Service service =
        ServiceLoader.load(Service.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No service"));

        List<Integer> testData2 = new ArrayList<>();
        testData2.add(1);
        testData2.add(null);
        testData2.add(2);
        Double result = service.average(testData2);
        System.out.println("Result: " + result);
    }
}
