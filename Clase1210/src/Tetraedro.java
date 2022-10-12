
public class Tetraedro implements I3D {
	private double arista;
	
	public Tetraedro(double arista) {
		this.arista = arista;
	}
	
	public double getArea() {
		return Math.pow(this.arista, 2) * Math.sqrt(3);
	}

	@Override
	public double getVolumen() {
		return Math.pow(this.arista, 3) * (Math.sqrt(2)/12);
	}

}
