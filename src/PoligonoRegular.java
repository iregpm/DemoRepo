public class PoligonoRegular {
	private final static int LONGI_DEF = 10;
	// Atributos privados pero heredables
	protected int    numLados;
	protected double longitudLado;
	protected int    color;
	
	public PoligonoRegular() {
		this.longitudLado = LONGI_DEF;
	}
	
	public double perimetro(){
		return this.numLados * 
				this.longitudLado;
	}
	
	public void agrandar(int valor){
		if (valor>0){
		   longitudLado+=valor;
		}
	}
	
	public void print() {
		System.out.println("Soy un poligono regular ");
		System.out.println("Pero no se cuantos lados tengo");
	}
	
	

}
