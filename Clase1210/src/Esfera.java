
public class Esfera implements I3D{
	private double radio;
	
	public Esfera(double radio) {
		this.radio=radio;
	}
	
	
	public double getArea() {
		return 4*Math.PI*Math.pow(this.radio, 2);
	}

	@Override
	public double getVolumen() {
		return 4/3*Math.PI*Math.pow(radio, 3);
	}

}
