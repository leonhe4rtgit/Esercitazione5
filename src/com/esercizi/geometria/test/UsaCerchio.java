package com.esercizi.geometria.test;

import com.esercizi.geometria.Cerchio;

public class UsaCerchio {

	public static void main(String[] args) {
		
		//CREO UN CERCHIO CON IL COSTRUTTORE
		Cerchio cerchio1 = new Cerchio(5.5);
		
		//STAMPO IL RAGGIO DEL CERCHIO 1
		System.out.println(cerchio1.getRaggio());
		
		//MODIFICO IL RAGGIO DEL CERCHIO 1
		cerchio1.setRaggio(8);
		
		//STAMPO IL NUOVO RAGGIO DEL CERCHIO 1
		System.out.println(cerchio1.getRaggio());
		
		//CALCOLO IL DIAMETRO DEL CERCHIO 1
		double diametroC1 = cerchio1.diametro();
		
		//STAMPO IL DIAMETRO DEL CERCHIO 1
		System.out.println(diametroC1);
		
		//CALCOLO LA CIRCONFERENZA DEL CERCHIO 1
		double circonferenzaC1 = cerchio1.circonferenza();
		
		//STAMPO LA CIRCONFERENZA DEL CERCHIO 1
		System.out.println(circonferenzaC1);
		
		//CALCOLO LA SUPERFICIE DEL CERCHIO 1
		double superficieC1 = cerchio1.superficie();
		
		//STAMPO LA SUPERFICIE DEL CERCHIO 1
		System.out.println(superficieC1);
		
		//CREO UN NUOVO CERCHIO C2
		Cerchio cerchio2 = new Cerchio(3.6);
		
		//CREO UN TERZO CERCHIO CON DIAMETRO PARI A QUELLO DI C1 + C2
		Cerchio sommaDeiRaggiDiC1eC2 = cerchio1.sommaRaggio(cerchio2);
		
		//ESTRAGGO IL RAGGIO DEL TERZO CERCHIO CREATO
		double sommaDeiRaggi = sommaDeiRaggiDiC1eC2.getRaggio();
		
		//STAMPO IL RAGGIO DEL TERZO CERCHIO CREATO
		System.out.println(sommaDeiRaggi);
	}

}
