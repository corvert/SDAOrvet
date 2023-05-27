package designPatterns.behavioralPatterns.strategy;

import java.io.File;
import java.util.ArrayList;

public class MyCustomizedCompressionStrategy implements CompressionStrategy{
    @Override
    public int compressFiles(ArrayList<File> files) {
        return 100;
    }
}
