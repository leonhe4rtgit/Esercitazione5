package com.esercizi.geometria.test;

import com.esercizi.anagrafica.Persona;

public class ProvaPersona {

	public static void main(String[] args) {
		
		Persona pers = 
				
		new Persona("Mario","Rossi","MROSSS32DRFTG",30,'M');
		
		pers.setNome("Giovanni");
		
		String nomePersona;
		
		nomePersona = pers.getNome();
		
		System.out.println(nomePersona);

	
	}

}
