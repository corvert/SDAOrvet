package designPatterns.structural.adapter;

public class AVIPlayer implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        //do nothing
    }
    @Override
    public void playMp4(String fileName) {
//do nothing
    }
    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing avi file. Name: " + fileName);

    }
}
