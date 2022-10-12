
public class Cuadrado implements IFigura {

	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return this.lado*this.lado;
	}

}
