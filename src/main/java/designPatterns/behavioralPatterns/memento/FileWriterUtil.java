package designPatterns.behavioralPatterns.memento;

public class FileWriterUtil {
    private String fileName;
    private StringBuilder content;

    FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    void write (String str){
        content.append(str);
    }
    Memento save(){
        return new Memento(this.fileName, this.content);
    }
    void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.fileName = memento.getFileName();
        this.content = memento.getContent();
    }
}
