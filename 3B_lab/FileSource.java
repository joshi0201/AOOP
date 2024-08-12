package threeB;

	public class FileSource implements TrackSource {
	    @Override
	    public void playTrack(String trackName) {
	        System.out.println("Playing from local file. Name: " + trackName);
	    }
	}

