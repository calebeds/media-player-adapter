import adapter.AdvancedMediaPlayerAdapter;
import advancedmediaplayer.AdvancedMediaPlayer;
import advancedmediaplayer.Mp4Player;
import advancedmediaplayer.VlcPlayer;
import mediaplayer.MediaPlayer;
import mediaplayer.MediaPlayerInterface;

public class Client {
    public static void main(String[] args) {


        MediaPlayerInterface mediaPlayer = new MediaPlayer();
        AdvancedMediaPlayer mp4Player = new Mp4Player();
        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();

        MediaPlayerInterface advanceMediaPlayerAdapterMp4 = new AdvancedMediaPlayerAdapter(mp4Player);
        MediaPlayerInterface advanceMediaPlayerAdapterVlc = new AdvancedMediaPlayerAdapter(vlcPlayer);

        mediaPlayer.play("mp3", "Set Fire To The Rain");
        mediaPlayer.play("mp4", "Set Fire To The Rain");
        mediaPlayer.play("vlc", "Set Fire To The Rain");

        advanceMediaPlayerAdapterMp4.play("mp4", "Set Fire To The Rain");
        advanceMediaPlayerAdapterMp4.play("mp3", "Set Fire To The Rain");
        advanceMediaPlayerAdapterMp4.play("vlc", "Set Fire To The Rain");

        advanceMediaPlayerAdapterVlc.play("mp3", "Set Fire To The Rain");
        advanceMediaPlayerAdapterVlc.play("mp4", "Set Fire To The Rain");
        advanceMediaPlayerAdapterVlc.play("vlc", "Set Fire To The Rain");
    }
}