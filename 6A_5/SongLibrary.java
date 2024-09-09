package six_a5;

import java.util.LinkedList;
import java.util.List;

public class SongLibrary {

	    private List<MusicPiece> musicList;

	    public SongLibrary() {
	        musicList = new LinkedList<>();
	    }

	    public void insertSong(String title, String artist) {
	        musicList.add(new MusicPiece(title, artist));
	    }

	    public void deleteSong(String title) {
	        boolean removed = false;
	        for (int i = 0; i < musicList.size(); i++) {
	            if (musicList.get(i).getTitle().equalsIgnoreCase(title)) {
	                musicList.remove(i);
	                removed = true;
	                break;
	            }
	        }
	        if (!removed) {
	            System.out.println("No song titled: " + title + " found.");
	        }
	    }

	    public void rearrangeSong(int originalPosition, int newPosition) {
	        if (originalPosition >= 1 && originalPosition <= musicList.size() &&
	            newPosition >= 1 && newPosition <= musicList.size()) {
	            MusicPiece song = musicList.remove(originalPosition - 1);
	            musicList.add(newPosition - 1, song);
	        } else {
	            System.out.println("Positions specified are not valid.");
	        }
	    }

	    public void listSongs() {
	        if (musicList.isEmpty()) {
	            System.out.println("The song library is empty.");
	        } else {
	            for (int i = 0; i < musicList.size(); i++) {
	                System.out.println((i + 1) + ". " + musicList.get(i));
	            }
	        }
	    }
	}
	