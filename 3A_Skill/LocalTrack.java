package threeA;

	public class LocalTrack implements AudioPlayer {
	    public void playFromLocal(String trackName) {
	        System.out.println("Playing from Local file. Track: " + trackName);
	    }

	    public void playFromOnline(String trackName) {
	        //System.out.println("Playing from Online stream.");
	    }

	    public void playFromRadio(String trackName) {
	        //System.out.println("Playing from Radio.");
	    }
	}



