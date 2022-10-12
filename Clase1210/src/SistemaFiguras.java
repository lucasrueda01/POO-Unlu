
public class SistemaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo miCirculo = new Circulo(4);
		System.out.println("Area de Circulo "+miCirculo.getArea());
		
		Cuadrado miCuadrado = new Cuadrado(2);
		System.out.println(("Area de Cuadrado "+miCuadrado.getArea()));
		
		
		Cubo miCubo = new Cubo(2);
		System.out.println("Area de Cubo "+miCubo.getArea());
		System.out.println("Volumen de Cubo "+miCubo.getVolumen());
		
		
	}

}
