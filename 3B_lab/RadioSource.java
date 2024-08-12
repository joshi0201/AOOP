package threeB;

	public class RadioSource implements TrackSource {
	    @Override
	    public void playTrack(String trackName) {
	        System.out.println("Playing from radio. Name: " + trackName);
	    }
	}
