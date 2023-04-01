package bookJavaFund.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class CalculateAverageSalary {
    public static void main(String[] args) throws Exception {
        Vector wages = loadWages("Adult.csv");
        long start = System.currentTimeMillis();
        int totalWage = 0;
        int maxWage = 0;
        int minWage = Integer.MAX_VALUE;

        for (Object wageAsObject : wages){
            int wage = (int) wageAsObject;
            totalWage += wage;
            if(wage > maxWage){
                maxWage = wage;
            }
            if (wage < minWage){
                maxWage = wage;
            }
        }
        System.out.printf("Read %d rows in %dms\n", wages.size(), System.currentTimeMillis() - start);
        System.out.printf("Average, Min, Max: %d, %d, %d\n", totalWage / wages.size(), minWage, maxWage);

    }
    private static Vector loadWages(String pathToFile) throws Exception{
        Vector result = new Vector<>();
        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try (CSVReader csvReader = new CSVReader(bufferedReader, false)){
            String[] row = null;
            while ((row = csvReader.readNow()) != null){
                if (row.length == 15){ // ignores empty lines
                    result.add(Integer.parseInt(row[2].trim()));
                }
            }
        }
        return result;
    }
}
