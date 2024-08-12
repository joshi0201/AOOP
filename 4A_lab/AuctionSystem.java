package FourA;

	public class AuctionSystem {
	    public static void main(String[] args) {
	        AuctionEvent auctionEvent = new AuctionEvent();

	        // Create participants
	        Participant participant1 = new Participant("Charlie");
	        Participant participant2 = new Participant("Dana");

	        // Register participants for auction notifications
	        auctionEvent.addListener(participant1);
	        auctionEvent.addListener(participant2);

	        // Auction events
	        auctionEvent.newItem("Vintage Watch");
	        auctionEvent.beginAuction();
	        auctionEvent.concludeAuction();

	        // Unsubscribe a participant
	        auctionEvent.removeListener(participant1);

	        // Another auction event after unsubscription
	        auctionEvent.newItem("Classic Car");
	    }
	}

