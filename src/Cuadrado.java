public class Cuadrado extends PoligonoRegular {
	// ¿Qué atributos tiene esta clase?
	// Los heredados: numLados, longitudLado
	// private int numLados
	// private int longitudLado
	// public int perimetro()
	// public void agrandar(int)
	
	public Cuadrado() {
		// Primero se llama al constructor de la clase padre
		// Llamada implícita al constructor sin param.
		this.numLados = 4;
	}
	// Añado superficie
	public double superficie() {
		
		return this.longitudLado * 
				this.longitudLado;
	}
	
	// Sobrecargo método agrandar para usar nº real
	// Tengo 2 métodos agrandar (el heredado (int) y
	// este con double
	public void agrandar(double valor) {
		this.longitudLado = valor; 
	}
	
	// Sobreescribo print
	@Override
	public void print() {
		System.out.printf("Soy un cuadrado, tengo %d lados%n",
				this.numLados);
	}
	


}
