package threeA;

	public class MusicAppMain {
	    public static void main(String[] args) {
	        AudioPlayer localPlayer = new LocalTrack();
	        AudioPlayer onlinePlayer = new OnlineStream();
	        AudioPlayer radioPlayer = new RadioStation();

	        // Adding Equalizer and Volume Control to Local Player
	        AudioPlayer decoratedLocalPlayer = new VolumeControlFeature(new EqualizerFeature(localPlayer));
	        decoratedLocalPlayer.playFromLocal("alone.mp3");

	        // Adding Equalizer to Online Player
	        AudioPlayer decoratedOnlinePlayer = new EqualizerFeature(onlinePlayer);
	        decoratedOnlinePlayer.playFromOnline("beyond the horizon.mp3");

	        // Adding Volume Control to Radio Player
	        AudioPlayer decoratedRadioPlayer = new VolumeControlFeature(radioPlayer);
	        decoratedRadioPlayer.playFromRadio("far far away.mp3");

	        // Using PlayAudio class
	        PlayAudio player = new PlayAudio();
	        player.play("online", "beyond the horizon.mp3");
	        player.play("local", "alone.mp3");
	        player.play("radio", "far far away.mp3");
	        player.play("local", "mind me.mp3");
	    }
	}
