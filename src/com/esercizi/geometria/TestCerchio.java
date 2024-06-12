package com.esercizi.geometria;

import javax.swing.JOptionPane;

public class TestCerchio {

	public static void main(String[] args) {

		// INPUT DA TASTIERA DEL RAGGIO 1
		String inputRaggio1 = JOptionPane.showInputDialog("INSERIRE RAGGIO CERCHIO 1");

		double raggio1 = Double.parseDouble(inputRaggio1);

		Cerchio c1 = new Cerchio(raggio1);

		// INPUT DA TASTIERA DEL RAGGIO 2
		String inputRaggio2 = JOptionPane.showInputDialog("INSERIRE RAGGIO CERCHIO 2");

		double raggio2 = Double.parseDouble(inputRaggio2);

		Cerchio c2 = new Cerchio(raggio2);

		// CALCOLO SUPERFICIE E CIRCONFERENZA DEI CERCHI

		double circonferenza1 = c1.circonferenza();

		System.out.println("CIRCONFERENZA CERCHIO 1 = " + circonferenza1);

		double circonferenza2 = c2.circonferenza();

		System.out.println("CIRCONFERENZA CERCHIO 2 = " + circonferenza2);

		double superficie1 = c1.superficie();

		System.out.println("SUPERFICIE CERCHIO 1 = " + superficie1);

		double superficie2 = c2.superficie();

		System.out.println("SUPERFICIE CERCHIO 2 = " + superficie2);

		// INPUT DA TASTIERA DEL RAGGIO 3
		String inputRaggio3 = JOptionPane.showInputDialog("INSERIRE RAGGIO CERCHIO 3");

		double raggio3 = Double.parseDouble(inputRaggio3);

		Cerchio c3 = new Cerchio(raggio3);
		
		//SOMMA RAGGIO C1 E C3
		Cerchio c13 = c1.sommaRaggio(c3);
		
		//SOMMA RAGGIO C1 E C2
		Cerchio c12 = c1.sommaRaggio(c2);
		
		//SOMMA RAGGIO C2 E C£
		Cerchio c23 = c2.sommaRaggio(c3);
		
		//ESTRAGGO I RAGGI DAI NUOVI CERCHI
		double raggio13 = c13.getRaggio();
		
		System.out.println("RAGGIO DEL CERCHIO 1,3 = " + raggio13);
		
		double raggio12 = c12.getRaggio();
		
		System.out.println("RAGGIO DEL CERCHIO 1,2 = " + raggio12);
		
		double raggio23 = c23.getRaggio();
		
		System.out.println("RAGGIO DEL CERCHIO 2,3 = " + raggio23);
	}

}
