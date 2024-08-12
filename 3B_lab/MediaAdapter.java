package threeB;

	public class MediaAdapter implements MediaPlayer {
	    PlayerBridge playerBridge;

	    public MediaAdapter(String formatType) {
	        if (formatType.equalsIgnoreCase("file")) {
	            playerBridge = new PlayerBridge(new FileSource());
	        } else if (formatType.equalsIgnoreCase("broadcast")) {
	            playerBridge = new PlayerBridge(new RadioSource());
	        } else {
	            playerBridge = new PlayerBridge(new StreamSource());
	        }
	    }

	    @Override
	    public void playMedia(String formatType, String trackName) {
	        playerBridge.playTrack(trackName);
	    }
	}

