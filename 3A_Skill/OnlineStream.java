package threeA;


	public class OnlineStream implements AudioPlayer {
	    public void playFromLocal(String trackName) {
	        //System.out.println("Playing from Local file.");
	    }

	    public void playFromOnline(String trackName) {
	        System.out.println("Playing from Online stream. Track: " + trackName);
	    }

	    public void playFromRadio(String trackName) {
	        //System.out.println("Playing from Radio.");
	    }
	}


