package threeB;

public class StreamSource implements TrackSource{
	@Override
    public void playTrack(String trackName) {
        System.out.println("Playing from source file. Name: " + trackName);
    }

}
