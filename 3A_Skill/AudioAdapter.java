package threeA;

	public class AudioAdapter implements AdvancedAudioPlayer {
	    AudioPlayer audioPlayer;

	    public AudioAdapter(String audioFormat) {
	        if (audioFormat.equalsIgnoreCase("local")) {
	            audioPlayer = new LocalTrack();
	        } else if (audioFormat.equalsIgnoreCase("radio")) {
	            audioPlayer = new RadioStation();
	        } else {
	            audioPlayer = new OnlineStream();
	        }
	    }

	    @Override
	    public void play(String audioFormat, String trackName) {
	        if (audioFormat.equalsIgnoreCase("local")) {
	            audioPlayer.playFromLocal(trackName);
	        } else if (audioFormat.equalsIgnoreCase("radio")) {
	            audioPlayer.playFromRadio(trackName);
	        } else {
	            audioPlayer.playFromOnline(trackName);
	        }
	    }
	}

