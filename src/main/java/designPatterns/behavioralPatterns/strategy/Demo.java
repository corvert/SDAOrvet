package designPatterns.behavioralPatterns.strategy;

import java.io.File;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();

        ctx.setCompressionContext(new ZipCompressionStrategy());
        ArrayList<File> fileList = new ArrayList<File>();
        File file = new File("test");
        fileList.add(file);
        System.out.println(ctx.createArchive(fileList));

        ctx.setCompressionContext(new RarCompressionStrategy());
        System.out.println(ctx.createArchive(fileList));

        ctx.setCompressionContext(new SevenCompressionStrategy());
        System.out.println(ctx.createArchive(fileList));

        ctx.setCompressionContext(new MyCustomizedCompressionStrategy());
        System.out.println(ctx.createArchive(fileList));
    }
}
