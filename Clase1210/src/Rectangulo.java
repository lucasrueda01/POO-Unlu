
public class Rectangulo implements IFigura {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		return this.base*this.altura;
	}

}
