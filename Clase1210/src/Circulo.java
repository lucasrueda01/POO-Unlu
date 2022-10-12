
public class Circulo implements IFigura {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.radio, 2);
	}
	
}
