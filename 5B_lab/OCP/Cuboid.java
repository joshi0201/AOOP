package ocp;

	public class Cuboid extends SolidFigure {
	    private double length;
	    private double breadth;
	    private double height;

	    public Cuboid(double length, double breadth, double height) {
	        this.length = length;
	        this.breadth = breadth;
	        this.height = height;
	        System.out.println("Cuboid created with length: " + length + ", breadth: " + breadth + " and height: " + height);
	    }

	    @Override
	    public double computeVolume() {
	        System.out.println("Computing volume of the cuboid.");
	        return length * breadth * height;
	    }
	}
