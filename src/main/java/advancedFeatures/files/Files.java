package advancedFeatures.files;

import java.io.*;

public class Files {
    public static void main(String[] args) {
        //Serialization is converting an object into a stream
        //Deserialization is the inverse, where You reverse a strem back into an abject

        String inputFile = "input.txt";
        bufferedString(inputFile, "output.txt");
        System.out.println("Operation seccessfull");


    }
    public static void bufferedString(String inputFilePath, String outputFilePath){
        try {
            //The buffered reader is meant to aid the file steam from the file reader
            //allowing us to interact with the stream based on the provisions in the buffered reader
            BufferedReader input = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFilePath));
            String line; // This will store each line of the text in the file

            //If current line we're reading is not empty write it to the file
            while ((line = input.readLine()) != null){
                output.write(line);
            }

            input.close();
            output.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
