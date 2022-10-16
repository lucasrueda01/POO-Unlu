package ar.unlu.poo.SistemaDeBiblioteca;

public class Biblo {

	public static void main(String[] args) {
		/*Libro Caperucita = new Libro("Caperucita","Romina",10,17);
		Libro ElPrincipito = new Libro("El Principito","Lucas",150,20);
		
		if(Caperucita.getNum_Paginas() > ElPrincipito.getNum_Paginas()) {
			System.out.println("Caperucita tiene mas paginas");
		}else {
			System.out.println("El principito tiene mas paginas");
		}
		boolean sepresto1;
		boolean sepresto2;
		sepresto1 =ElPrincipito.Prestar();
		sepresto2=Caperucita.Prestar();
		
		if (sepresto1) {
			System.out.println("Se presto el libro El Principito");
		}
		if (sepresto2) {
			System.out.println("Se presto el libro Caperucita");
		}
		System.out.println(Libro.getCant_TOTAL_prestamos().toString());*/
		
		Libro miLibro = new Libro("El principito", "Yo" , "Editorial", 100, 10, 2001);
		//System.out.println(miLibro.Descripcion());
		Revista miRevista = new Revista("Gente", "Mirta", 200, 4, 1990, 69);
		//System.out.println(miRevista.Descripcion());
		Diario miDiario = new Diario("Extra", "Clarin", 2001, 9, 11);
		//System.out.println(miDiario.Descripcion());
		miLibro.Prestar();
		miLibro.Prestar();
		miLibro.Prestar();
		miRevista.Prestar();
		System.out.println("Se han realizado " + Escrito.getCantTotalPrestamos() + " prestamos ");
	}} 
