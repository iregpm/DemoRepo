public class PentagonoRegular extends PoligonoRegular {
	// SOLO SI QUEREMOS QUE TENGA VALOR DE APOTEMA 
	// COMO ATRIBUTO
	// protected double apotema; Si quieres que sea heredable
	// private   double apotema; Si NO quieres que sea heredable
	public PentagonoRegular() {
	    // NO HAY llamada implícita a super() 
		// porque está el this
		this(100);
	}	
	public PentagonoRegular(int lado) {
		// No me vale llamada implícita a super() 
		super();
		this.numLados = 5;
	}
    /*public double apotema() {
    	
    }*/
    /*public double superficie() {
    	
    }*/

}
