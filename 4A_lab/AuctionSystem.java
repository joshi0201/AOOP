package FourA;

	public class AuctionSystem {
	    public static void main(String[] args) {
	        AuctionEvent auctionEvent = new AuctionEvent();

	        
	        Participant participant1 = new Participant("Joshi");
	        Participant participant2 = new Participant("Deepu");

	        auctionEvent.addListener(participant1);
	        auctionEvent.addListener(participant2);

	        
	        auctionEvent.newItem("Vintage Watch");
	        auctionEvent.beginAuction();
	        auctionEvent.concludeAuction();

	       
	        auctionEvent.removeListener(participant1);

	        // Another auction event after unsubscription
	        auctionEvent.newItem("Classic Car");
	    }
	}

