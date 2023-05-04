package adapter;

import advancedmediaplayer.AdvancedMediaPlayer;
import mediaplayer.MediaPlayerInterface;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {

    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        this.advancedMediaPlayer.loadFilename(fileName);
        this.advancedMediaPlayer.listen(audioType);
    }
}
