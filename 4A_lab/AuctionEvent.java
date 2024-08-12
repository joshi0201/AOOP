package FourA;
import java.util.ArrayList;
import java.util.List;


	public class AuctionEvent implements Notifier {
	    private List<Listener> participants;

	    public AuctionEvent() {
	        participants = new ArrayList<>();
	    }

	    @Override
	    public void addListener(Listener listener) {
	        participants.add(listener);
	        System.out.println("Participant subscribed to auction notifications.");
	    }

	    @Override
	    public void removeListener(Listener listener) {
	        participants.remove(listener);
	        System.out.println("Participant unsubscribed from auction notifications.");
	    }

	    @Override
	    public void notifyListeners(String event) {
	        for (Listener participant : participants) {
	            participant.onUpdate(event);
	        }
	        System.out.println("All participants notified about event: " + event);
	    }

	    public void beginAuction() {
	        System.out.println("Auction is now live.");
	        notifyListeners("Auction is now live");
	    }

	    public void concludeAuction() {
	        System.out.println("Auction has concluded.");
	        notifyListeners("Auction has concluded");
	    }

	    public void newItem(String item) {
	        System.out.println("New item added for auction: " + item);
	        notifyListeners("New item: " + item);
	    }
	}
	
