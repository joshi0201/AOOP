package threeB;

	public class SimpleMusicPlayer implements AudioPlayer {
	    private PlayerBridge playerBridge;

	    public SimpleMusicPlayer(PlayerBridge playerBridge) {
	        this.playerBridge = playerBridge;
	    }

	    @Override
	    public void play(String trackName) {
	        playerBridge.playTrack(trackName);
	    }
	}

