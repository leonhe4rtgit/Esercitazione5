package com.esercizi.geometria;

public class Poligono {

	private int numeroLati;
	private double lunghezzaLato;

	public Poligono(int n) {

		this.lunghezzaLato = 1.0;
		this.numeroLati = n;

	}

	public int getNumeroLati() {
		return numeroLati;
	}

	public void setNumeroLati(int numeroLati) {
		this.numeroLati = numeroLati;
	}

	public double getLunghezzaLato() {
		return lunghezzaLato;
	}

	public void setLunghezzaLato(double lunghezzaLato) {
		this.lunghezzaLato = lunghezzaLato;
	}

}
