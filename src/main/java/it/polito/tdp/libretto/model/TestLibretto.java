package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto lib = new Libretto();
		
		lib.add(new Voto("Analisi I", 29, LocalDate.of(2021, 2, 15)));
		lib.add(new Voto("Analisi II", 21, LocalDate.of(2022, 6, 10)));
		lib.add(new Voto("Informatica", 25, LocalDate.of(2022, 3, 11)));
		lib.add(new Voto("Fisica I", 22, LocalDate.of(2022, 6, 2)));

		lib.stampa();
		
		lib.stampaPerVoto(25);
		Voto v=lib.stampaPerNome("Analisi I");
		System.out.println(v);
		v= lib.stampaPerNome("Analisi 2");
		System.out.println(v);
		
		Voto a1bis= new Voto("Analisi I" , 29, LocalDate.of(2021, 3, 17));
		Voto a1ter= new Voto("Analisi I" , 30, LocalDate.of(2021, 3, 17));
		
		System.out.println(a1bis + "è duplicato"+" "+ lib.esisteVotoDuplicato(a1bis));
		System.out.println(a1ter + "è duplicato"+" " +
		lib.esisteVotoDuplicato(a1ter));
		
		try {
			lib.add(new Voto("Informatica", 25, LocalDate.of(2022, 3, 5)));
			} 
			catch (IllegalArgumentException e) {
				System.out.print("Errore nell'inserimento voto.");
				System.out.print(e.getMessage());
			}
		
		Libretto migliore =  lib.librettoMigliorato();
		System.out.println("LIBRETTO MIGLIORE: "+'\n');
		migliore.stampa();
		System.out.println("LIBRETTO VECCHIO: "+'\n');
		lib.stampa();
		
		/*lib.cancellaVotiInferiori(24);
		System.out.println("LIBRETTO CON VOTI MAGGIORI DI 24: "+'\n');
		lib.stampa();*/
		System.out.println("LIBRETTO ORDINATO PER NOME: "+'\n');
		lib.ordinaLibrettoPerNome().stampa();
		System.out.println("LIBRETTO ORDINATO PER VOTO: "+'\n');
		lib.ordinaLibrettoPerVoto().stampa();
	}

}
