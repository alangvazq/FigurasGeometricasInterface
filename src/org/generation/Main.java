package org.generation;

public class Main {

	public static void main(String[] args) {
		Triangulo t = new Triangulo("TrianguloTE", 250, 175, 145);
		Cuadrado cuadrado = new Cuadrado("Cubo", 10);
		Rectangulo rectangulo = new Rectangulo("Rec", 15, 45);
		Rombo rombo = new Rombo("rambo", 123, 53, 5);
		Romboide romboide = new Romboide("Romboide", 84, 12);
		Trapecio trapecio = new Trapecio("Trap", 2, 4, 9, 4, 9, 4, 2);
		

		imprimirCalculo(t);
		imprimirCalculo(cuadrado);
		imprimirCalculo(rectangulo);
		imprimirCalculo(rombo);
		imprimirCalculo(romboide);
		imprimirCalculo(trapecio);

	}

	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+===============================");
		System.out.println("El área de [" + f.getNombre() + "] es :" + f.calcularArea());
		System.out.println("El perimétro de [" + f.getNombre() + "] es :" + f.calcularPerimetro());
		System.out.println("+===============================");
	}
}
