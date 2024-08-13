package ocp;

public class VolumeCalculatorDemo {
	 public static void main(String[] args) {
	        SolidFigure cuboid = new Cuboid(3, 5, 8);
	        System.out.println("Cuboid volume: " + cuboid.computeVolume());

	        SolidFigure sphere = new Sphere(7);
	        System.out.println("Sphere volume: " + sphere.computeVolume());
	    }


}
