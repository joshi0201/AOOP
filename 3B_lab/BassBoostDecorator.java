package threeB;

	public class BassBoostDecorator implements AudioPlayer {
	    protected AudioPlayer decoratedPlayer;

	    public BassBoostDecorator(AudioPlayer decoratedPlayer) {
	        this.decoratedPlayer = decoratedPlayer;
	    }

	    @Override
	    public void play(String trackName) {
	        decoratedPlayer.play(trackName);
	        applyBassBoost();
	    }

	    private void applyBassBoost() {
	        System.out.println("Bass boost settings applied.");
	    }
	}

