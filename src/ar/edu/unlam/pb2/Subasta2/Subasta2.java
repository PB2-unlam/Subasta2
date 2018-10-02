package ar.edu.unlam.pb2.Subasta2;

public class Subasta2 {
	private Integer mayorValor=0;
	private Boolean estadoSubasta = true;
	
	//C
	public Subasta2() {
	
	}
	
	//ofertar
	public void ofertar(Integer valor) {
		if(this.estadoSubasta) {
			if(valor>this.mayorValor) {
				this.mayorValor=valor;
			}
		}
	}

	//cerrar
	public Integer cerrar() {
		this.estadoSubasta=false;
		return this.mayorValor;
	}
	
	//estadoSubasta
	public Boolean estadoSubasta() {
		return this.estadoSubasta;
	}
}
