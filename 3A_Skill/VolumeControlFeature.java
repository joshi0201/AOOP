package threeA;

	public class VolumeControlFeature extends AudioDecorator {

	    public VolumeControlFeature(AudioPlayer decoratedAudio) {
	        super(decoratedAudio);
	    }

	    @Override
	    public void playFromLocal(String trackName) {
	        super.playFromLocal(trackName);
	        adjustVolume();
	    }

	    @Override
	    public void playFromOnline(String trackName) {
	        super.playFromOnline(trackName);
	        adjustVolume();
	    }

	    @Override
	    public void playFromRadio(String trackName) {
	        super.playFromRadio(trackName);
	        adjustVolume();
	    }

	    private void adjustVolume() {
	        System.out.println("Volume adjusted to preferred level.");
	    }
	}

