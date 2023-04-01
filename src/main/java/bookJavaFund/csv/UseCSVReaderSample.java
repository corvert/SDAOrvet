package bookJavaFund.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseCSVReaderSample {
    public static void main(String[] args) throws IOException {
        String fileName = "users.csv";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        try (CSVReader csvReader = new CSVReader(reader)){
            String[] row;
            while ((row = csvReader.readNow()) != null) {
                System.out.printf("%d - %s\n", csvReader.getLineCount(), row[1]);
            }
        }

    }
}
