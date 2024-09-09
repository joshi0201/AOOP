package six_a5;

public class MusicPiece {
	    private String title;
	    private String artist;

	    public MusicPiece(String title, String artist) {
	        this.title = title;
	        this.artist = artist;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getArtist() {
	        return artist;
	    }

	    @Override
	    public String toString() {
	        return title + " performed by " + artist;
	    }
	}

