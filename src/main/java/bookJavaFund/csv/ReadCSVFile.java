package bookJavaFund.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) throws IOException {
        String fileName = "users.csv";

        FileReader fileReader = new FileReader(fileName);
        try (BufferedReader reader = new BufferedReader(fileReader)){
            String line;
            int lineCounter = -1;
            while ((line = reader.readLine()) != null){
                lineCounter++;
                //Ignore the header
                if(lineCounter == 0){
                    continue;
                }
                String[] split = line.split(",");
                System.out.printf("%d - %s\n", lineCounter, split[1]);
            }
        }
    }
}
