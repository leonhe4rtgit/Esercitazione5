package com.esercizi.geometria;

public class Cerchio {
	
	private double raggio;

	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	//METODO CHE CALCOLA IL DIAMETRO
	public double diametro() {
		
		double diametro = this.raggio * 2;
		
		return diametro;
	}
	
	//METODO CHE CALCOLA LA CIRCONFERENZA
	public double circonferenza() {
		
		double circonf = this.raggio * 6.28;
		
		return circonf;
		
	}
	
	//METODO CHE CALCOLA LA SUPERFICIE
	public double superficie() {
		
		double sup = this.raggio * this.raggio * 3.14;
		
		return sup;
		
	}

	//METODO CHE SOMMA I RAGGI DI DUE CERCHI
	public Cerchio sommaRaggio(Cerchio cerchioInput) {
		
		//ESTRAGGO IL RAGGIO DAL CERCHIO DI INPUT
		double raggioInput = cerchioInput.getRaggio();
		
		//MEMORIZZO IN UNA VARIABILE DI APPOGGIO LA SOMMA DEI RAGGI
		double sommaRaggi = raggioInput + this.raggio;
		
		//CREO UN NUOVO CERCHIO CON SOMMARAGGI
		Cerchio cerchioOutput = new Cerchio(sommaRaggi);
		
		return cerchioOutput;
		
	}
	
}
