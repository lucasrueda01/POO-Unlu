
public class Cubo implements I3D {
	private Double arista;
	
	public Cubo(double arista) {
		this.arista=arista;
	}
	
	public double getArea() {
		return 6*(Math.pow(arista, 2));
	}

	@Override
	public double getVolumen() {
		return Math.pow(arista, 3);
	}

}
