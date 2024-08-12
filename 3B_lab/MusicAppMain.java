package threeB;

public class MusicAppMain {

    public static void main(String[] args) {
        // Using the MusicPlayer with MediaAdapter (which now uses the Bridge Pattern)
        MusicPlayer player = new MusicPlayer();

        player.playMedia("stream", "journey.mp3");
        player.playMedia("file", "solitude.mp3");
        player.playMedia("broadcast", "mystic.mp3");
        player.playMedia("file", "echoes.mp3");

        // Demonstrating the use of decorators with the bridge
        PlayerBridge decoratedFilePlayer = new PlayerBridge(new FileSource());
        AudioPlayer decoratedWithBassBoost = new BassBoostDecorator(new SimpleMusicPlayer(decoratedFilePlayer));
        VolumeAdjustDecorator decoratedWithVolumeAdjust = new VolumeAdjustDecorator(decoratedWithBassBoost);
        decoratedWithVolumeAdjust.play("solitude.mp3");
    }
}

