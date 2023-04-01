package bookJavaFund.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

public class GroupWageByEducation {
    public static void main(String[] args) throws Exception{
        Hashtable<String, Vector<Integer>> wagesByEducation = loadWages("Adult.csv");

        for(Map.Entry<String, Vector<Integer>> entry : wagesByEducation.entrySet()){
            Vector<Integer> wages = entry.getValue();
            int totalWage = 0;
            int maxWage = 0;
            int minWage = Integer.MAX_VALUE;

            for (Integer wage : wages){
                totalWage += wage;
                if (wage > maxWage){
                    maxWage = wage;
                }
                if (wage < minWage){
                    minWage = wage;
                }
            }
            System.out.printf("%d records found for eduction %s\n", wages.size(), entry.getKey());
            System.out.printf("\tAverage, Min, Max: %d, %d, %d\n", totalWage/wages.size(), minWage, maxWage);
        }


    }
    private static Hashtable<String, Vector<Integer>> loadWages(String pathToFile) throws Exception{
        Hashtable<String, Vector<Integer>> result = new Hashtable<>();
        FileReader fileReader = new FileReader(pathToFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try (CSVReader csvReader = new CSVReader(bufferedReader, false)){
            String[] row = null;
            while ((row = csvReader.readNow()) != null){
                if (row.length == 15);
                String education = row[3].trim();
                int wage = Integer.parseInt(row[2].trim());

                Vector<Integer> wages = result.getOrDefault(education, new Vector<>());
                wages.add(wage);
                result.put(education, wages);
            }
        }
        return result;
    }
}
