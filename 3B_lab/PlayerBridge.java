package threeB;

public class PlayerBridge {
	  private TrackSource trackSource;

	    public PlayerBridge(TrackSource trackSource) {
	        this.trackSource = trackSource;
	    }

	    public void playTrack(String trackName) {
	        trackSource.playTrack(trackName);
	    }

}
