package threeA;

	public abstract class AudioDecorator implements AudioPlayer {
	    protected AudioPlayer decoratedAudio;

	    public AudioDecorator(AudioPlayer decoratedAudio) {
	        this.decoratedAudio = decoratedAudio;
	    }

	    public void playFromLocal(String trackName) {
	        decoratedAudio.playFromLocal(trackName);
	    }

	    public void playFromOnline(String trackName) {
	        decoratedAudio.playFromOnline(trackName);
	    }

	    public void playFromRadio(String trackName) {
	        decoratedAudio.playFromRadio(trackName);
	    }
	}

