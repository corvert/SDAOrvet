package advancedFeatures.lecture02.audio;

public class AudioTest {
    public static void main(String[] args) {
        Playable mp3 = new Mp3player();
        mp3.play();

        Playable wav = new WavePlayer();
        wav.play();

        Playable mp4 = () -> {
            System.out.println("Playing mp4");
        };

        Playable aac = new Playable() {
            private int VAL = 20;


            public int getVal() {
                return VAL;
            }

            @Override
            public void play() {
                System.out.println("Playing aac");
            }
        };

        aac.play();
        mp4.play();

    }
}
