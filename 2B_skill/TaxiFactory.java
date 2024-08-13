package twoA;

	class TaxiFactory extends TransportFactory {
	    public Transport createTransport() {
	        return new Taxi();
	    }
	}

	class MotorcycleFactory extends TransportFactory {
	    public Transport createTransport() {
	        return new Motorcycle();
	    }
	}

