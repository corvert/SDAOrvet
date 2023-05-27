package designPatterns.behavioralPatterns.strategy;

import java.io.File;
import java.util.ArrayList;

public interface CompressionStrategy {
    int compressFiles(ArrayList<File> files);
}
