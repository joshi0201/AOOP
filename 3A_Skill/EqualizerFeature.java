package threeA;

	public class EqualizerFeature extends AudioDecorator {

	    public EqualizerFeature(AudioPlayer decoratedAudio) {
	        super(decoratedAudio);
	    }

	    @Override
	    public void playFromLocal(String trackName) {
	        super.playFromLocal(trackName);
	        applyEqualizer();
	    }

	    @Override
	    public void playFromOnline(String trackName) {
	        super.playFromOnline(trackName);
	        applyEqualizer();
	    }

	    @Override
	    public void playFromRadio(String trackName) {
	        super.playFromRadio(trackName);
	        applyEqualizer();
	    }

	    private void applyEqualizer() {
	        System.out.println("Equalizer settings applied.");
	    }
	}

