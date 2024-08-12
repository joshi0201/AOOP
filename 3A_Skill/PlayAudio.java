package threeA;

	public class PlayAudio implements AdvancedAudioPlayer {
	    AudioAdapter audioAdapter;

	    public void play(String audioFormat, String trackName) {
	        if (audioFormat.equalsIgnoreCase("local")) {
	            System.out.println("Playing from Local file. Track: " + trackName);
	        } else if (audioFormat.equalsIgnoreCase("radio") || audioFormat.equalsIgnoreCase("online")) {
	            audioAdapter = new AudioAdapter(audioFormat);
	            audioAdapter.play(audioFormat, trackName);
	        } else {
	            System.out.println("Invalid format. " + audioFormat + " is not supported.");
	        }
	    }
	}
