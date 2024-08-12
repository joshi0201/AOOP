package threeB;

	public class MusicPlayer implements MediaPlayer {
	    MediaAdapter mediaAdapter;

	    public void playMedia(String formatType, String trackName) {
	        // Inbuilt support to play mp3 music files
	        if (formatType.equalsIgnoreCase("file")) {
	            System.out.println("Playing local file. Name: " + trackName);
	        } 
	        // MediaAdapter is providing support to play other file formats
	        else if (formatType.equalsIgnoreCase("broadcast") || formatType.equalsIgnoreCase("stream")) {
	            mediaAdapter = new MediaAdapter(formatType);
	            mediaAdapter.playMedia(formatType, trackName);
	        } 
	        else {
	            System.out.println("Invalid media. " + formatType + " format not supported");
	        }
	    }
	}

