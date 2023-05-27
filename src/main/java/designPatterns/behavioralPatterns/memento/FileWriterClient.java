package designPatterns.behavioralPatterns.memento;

public class FileWriterClient {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set of Date\n");
        System.out.println(fileWriter + "\n\n");
        //let's save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second Set of Data\n");
        //checking file contents
        System.out.println(fileWriter + "\n\n");
        caretaker.save(fileWriter);
        //let's undo to last save
        caretaker.undo(fileWriter);
        fileWriter.write("Third Set of Data \n\n");
        //checking file contents
        System.out.println(fileWriter + "\n\n");
        caretaker.save(fileWriter);
        //checking file content again
        System.out.println(fileWriter + "\n\n");
    }
}
