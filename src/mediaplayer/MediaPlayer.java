package mediaplayer;

public class MediaPlayer implements MediaPlayerInterface {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3"))
            System.out.println(fileName + " is playing.");
        else
            System.out.println(audioType + " not supported.");
    }
}
