package advancedmediaplayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    private String filename;
    @Override
    public void loadFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void listen(String audioType) {
        if(audioType.equalsIgnoreCase("mp4"))
            System.out.println(filename + " is playing.");
        else
            System.out.println(audioType + " not supported.");
    }

}
