package ocp;

	public class Sphere extends SolidFigure {
	    private double radius;

	    public Sphere(double radius) {
	        this.radius = radius;
	        System.out.println("Sphere created with radius: " + radius);
	    }

	    @Override
	    public double computeVolume() {
	        System.out.println("Computing volume of the sphere.");
	        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	    }
	}
