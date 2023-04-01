package bookJavaFund.csv;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;

public class CSVReader implements Closeable {
    private final BufferedReader reader;
    private int lineCount = 0;

    public CSVReader(BufferedReader reader) throws IOException {
        this.reader = reader;
        //Ignores the header
        //reader.readLine();
    }

    public void close() throws IOException {
        this.reader.close();
    }

    public String[] readNow() throws IOException {
        String line = reader.readLine();
        if (line == null) {
            return null;
        }
        lineCount++;
        return line.split(",");
    }

    public int getLineCount() {
        return lineCount;
    }
    public CSVReader(BufferedReader reader, boolean ignoreFirstLine) throws IOException{
        this.reader = reader;
        if(ignoreFirstLine){
            reader.readLine();
        }
    }
}
