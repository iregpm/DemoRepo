public class Triangulo extends PoligonoRegular {
    // Atributo propio
	protected double altura;
    
	// constructor para que nº de lados sea 3
	public Triangulo() {
		double c1 = longitudLado/2;
		double h = longitudLado;
		this.altura = 
				Math.sqrt(Math.pow(h,2)-Math.pow(c1,2));
		this.numLados = 3;
	}
	// sobrecargar un método
	public void agrandar(int valor, char medida) {
		longitudLado += valor;
	}
	// sobreescribir print
	public void print() {
		System.out.println("Hola soy un triangulo ");
		System.out.printf("de altura %.2f%n", altura);
	}
	// añadir método propio superficie
	public double superficie() {
		return (longitudLado*altura)/2;
	}
	
}
