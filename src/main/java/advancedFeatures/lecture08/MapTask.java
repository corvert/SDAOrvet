package advancedFeatures.lecture08;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> countries = new LinkedHashMap<>();

        System.out.println("How many countries do You want to enter?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter country:");
            String country = sc.next();
            System.out.println("Enter capital:");
            String capital = sc.next();
            countries.put(country, capital);
        }
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("The capital of " + entry.getKey() + " is " + entry.getValue());
        }
    }
}
