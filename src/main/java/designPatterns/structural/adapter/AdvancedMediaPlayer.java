package designPatterns.structural.adapter;

public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);
    public void playMp4(String fileName);
    void playAvi(String fileName);

}