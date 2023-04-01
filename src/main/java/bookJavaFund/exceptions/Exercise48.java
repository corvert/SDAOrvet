package bookJavaFund.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise48 {
    private static void useTheFile(String s){
        System.out.println(s);
        throw new RuntimeException();
    }

    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
            System.out.println("opened file, which will be closed automatically");
            useTheFile(br.readLine());
        } catch (IOException e){
            System.out.println("caught an I/O exception while reading file");
            throw new Exception("something is wrong with I/O", e);
        } catch (Exception e){
            System.out.println("caught an exception while readoing the file");
        }
    }
}
