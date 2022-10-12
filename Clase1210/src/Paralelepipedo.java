
public class Paralelepipedo implements I3D,IFigura {
	private double arista1;
	private double arista2;
	private double arista3;
	
	
	public double getArea() {
		return 2*(arista1*arista2 + arista1*arista3 + arista2*arista3);
	}

	@Override
	public double getVolumen() {
		return arista1*arista2*arista3;
	}

}
