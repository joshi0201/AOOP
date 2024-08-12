package threeB;

	public class VolumeAdjustDecorator implements AudioPlayer {
	    protected AudioPlayer decoratedPlayer;

	    public VolumeAdjustDecorator(AudioPlayer decoratedPlayer) {
	        this.decoratedPlayer = decoratedPlayer;
	    }

	    @Override
	    public void play(String trackName) {
	        decoratedPlayer.play(trackName);
	        adjustVolume();
	    }

	    private void adjustVolume() {
	        System.out.println("Volume adjusted to preferred level.");
	    }
	}

